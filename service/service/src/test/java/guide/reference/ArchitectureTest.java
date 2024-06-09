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
    void testInfraShouldOnlyBeAccessedByDataAndMain() {
        ArchRule rule;
        rule = layeredArchitecture().consideringAllDependencies();
        rule.check(importedClasses);
    }

    
}
