package guide.reference;

import org.junit.jupiter.api.Test;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;
import static com.tngtech.archunit.library.Architectures.layeredArchitecture;

public class ArchitectureTest {

    JavaClasses importedClasses = new ClassFileImporter().importPackages("guide.reference");

    @Test
    public void testDomainShouldNotAccessAnyOtherLayer(){
        ArchRule rule = noClasses().that().resideInAPackage("..domain..")
        .should().accessClassesThat().resideInAnyPackage(
            "..infra..", "..presentation..",
            "..data..","..main.."
        );
        rule.check(importedClasses);
    }

    @Test
    public void testInfraShouldOnlyBeAccessedByDataAndMain() {
        ArchRule rule = layeredArchitecture()
        .layer("Infra").definedBy("guide.reference.infra..")
        .layer("Main").definedBy("guide.reference.main..")
        .layer("Domain").definedBy("guide.reference.domain..")
        .layer("Presentation").definedBy("guide.reference.presentation..")
        .layer("Data").definedBy("guide.reference.data..")
        .whereLayer("Infra").mayOnlyBeAccessedByLayers("Main");
        rule.check(importedClasses);
    }

    
}
