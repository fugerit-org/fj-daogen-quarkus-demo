package test.org.fugerit.java.fjdaogenquickstart;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

@QuarkusTest
class LoadDocumentTest {

    private static final String TEST = "Silmarillion";
    @Test
    void testDocumentLoadAll() {
        given()
          .when().get("/document/load/all")
          .then()
             .statusCode(200)
             .body(containsString(TEST));
    }

    @Test
    void testDocumentLoadOneDeep() {
        given()
                .when().get("/document/load/deep/id/10")
                .then()
                .statusCode(200)
                .body(containsString(TEST));
    }

    @Test
    void testDocumentLoadOne() {
        given()
                .when().get("/document/load/id/10")
                .then()
                .statusCode(200)
                .body(containsString(TEST));
    }

    @Test
    void testDocumentLoadByCreator() {
        given()
                .when().get("/document/load/id_creator/1")
                .then()
                .statusCode(200)
                .body(containsString(TEST));
    }

    @Test
    void testDocumentLoadByOwner() {
        given()
                .when().get("/document/load/id_owner/3")
                .then()
                .statusCode(200)
                .body(containsString(TEST));
    }

}