package in.reqres.datainfo;

import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import javax.swing.text.Utilities;

import static io.restassured.RestAssured.given;

public class GetSingleUserTest extends TestBase {
    @Test
    public void getsingleUser(){
        Response response=given()
                .headers("Connection","keep-alive")
                .pathParam("id",2)
                .when()
                .get("/users/{id}");
        response.then().statusCode(200);
        response.prettyPrint();



    }

}
