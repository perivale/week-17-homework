package in.reqres.datainfo;

import in.reqres.Model.ReqresPojo;
import in.reqres.testbase.TestBase;

import io.restassured.response.Response;

import org.junit.Test;


import static io.restassured.RestAssured.given;

public class PostLoginSuccessfulTest extends TestBase {

    @Test
    public void loginSuccesful() {

        ReqresPojo reqresPojo=new ReqresPojo();
        reqresPojo.setEmail("eve.holt@reqres.in");
        reqresPojo.setPassword("cityslicka");


        Response response = given()
                .header("Content-Type", "application/json")
                .body(reqresPojo)
                .when()
                .post("/users");
        response.then().statusCode(201);
        response.prettyPrint();




    }
}