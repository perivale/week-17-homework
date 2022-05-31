package in.reqres.testbase;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;

import static io.restassured.RestAssured.given;

/**
 * Created by Jay Vaghani
 */
public class TestBase {
    static ValidatableResponse response;


    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI="https://reqres.in/";
        RestAssured.basePath="api";
        response= given()
                .when()
                .get("/users")
                .then().statusCode(200);





    }
}
