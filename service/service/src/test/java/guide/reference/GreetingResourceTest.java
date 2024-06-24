package guide.reference;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
class GreetingResourceTest {
    @Test
    void testHelloEndpoint() {
        given()
          .when().get("/hello")
          .then()
             .statusCode(404);
    }
    @Test
    void testOkEndpoint() {
        given()
          .when().get("/ok")
          .then()
             .statusCode(200)
             .body(is("{\"message\":\"System check is ok\"}"));
    }
}