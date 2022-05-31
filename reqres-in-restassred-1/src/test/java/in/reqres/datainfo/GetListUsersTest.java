package in.reqres.datainfo;


import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class GetListUsersTest extends TestBase {



    @Test
    public void getAllListUserInfo() {
        Response response=given()
                .when()
                .get("/users");
        response.then().statusCode(200);
        response.prettyPrint();

    }


    }






