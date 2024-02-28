package test.org.fugerit.java.fjdaogenquickstart;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

@QuarkusTest
class BasicApiTest {
    @Test
    void testDocumentLoadAll() {
        given()
          .when().get("/document/load/all")
          .then()
             .statusCode(200)
             .body(containsString("Silmarillion"));
    }

    @Test
    void testExample01LoadAll() {
        given()
                .when().get("/example01/load/all")
                .then()
                .statusCode(200)
                .body(containsString("field3"));
    }

    @Test
    void testMappedtableLoadAll() {
        given()
                .when().get("/mappedtable/load/all")
                .then()
                .statusCode(200)
                .body(containsString("Mapped"));
    }
    @Test
    void testPersonLoadAll() {
        given()
                .when().get("/person/load/all")
                .then()
                .statusCode(200)
                .body(containsString("Miriel"));
    }

}