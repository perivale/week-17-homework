package in.reqres.datainfo;

import in.reqres.Model.ReqresPojo;
import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class PostCreateTest extends TestBase {



    @Test
    public void createUser() {

        ReqresPojo reqresPojo=new ReqresPojo();
        reqresPojo.setName("morpheus");
        reqresPojo.setJob("leader");


        Response response=given()
                .header("Content-Type", "application/json")
                .body(reqresPojo)
                .when()
                .post("/users");
        response.then().statusCode(201);
        response.prettyPrint();








    }





    }






