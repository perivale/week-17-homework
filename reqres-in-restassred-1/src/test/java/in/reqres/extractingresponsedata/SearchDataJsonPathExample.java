package in.reqres.extractingresponsedata;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

/*
 *  Created by Jay
 */
public class SearchDataJsonPathExample {
    static ValidatableResponse response;

    @BeforeClass
    public static void inIt() {
        RestAssured.baseURI = "https://reqres.in/";
        RestAssured.basePath = "api";
        response = given()
                .when()
                .get("/users")
                .then().statusCode(200);

    }


    // 1.page = 2
    @Test
    public void test001() {
        int page=response.extract().path("page=2");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The value of page is : "+page);
        System.out.println("------------------End of Test---------------------------");

    }

    // 2.per_page = 6
    @Test
    public void test002() {
       int listofpage=response.extract().path("per_page");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("List of page are : "+listofpage);
        System.out.println("------------------End of Test---------------------------");

    }

    // 3) Extract data[1].id = 8
    @Test
    public void test003() {
       int  data= response.extract().path("data[1].id");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The data is : "+data);
        System.out.println("------------------End of Test---------------------------");
    }

    // 4) data[3].first_name = Byron
    @Test
    public void test004() {
        String firstname=response.extract().path("data[3].first_name");


        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The firstname are : "+firstname);
        System.out.println("------------------End of Test---------------------------");

    }

    // 5)list of data = 6
    @Test
    public void test005() {
      List<String>  sizeofdata=response.extract().path("data");
        //data[*].size

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The size of the data is : "+sizeofdata.size());
        System.out.println("------------------End of Test---------------------------");
    }

    // 6) Get All the data[5].avatar
    @Test
    public void test006() {
        String listofalldata=response.extract().path("data[5].avatar");
        //data.name

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The names of the all the data are : "+listofalldata);
        System.out.println("------------------End of Test---------------------------");
    }

    // 7) support.url ="https://reqres.in/#support-heading
    @Test
    public void test007() {
        String url=response.extract().path("support.url");


        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The support url are: "+url);
        System.out.println("------------------End of Test---------------------------");
    }

    // 8) Get the support.txt = "To keep ReqRes free, contributions towards server costs are appreciated
    @Test
    public void test008() {
        String text=response.extract().path("support.text");

        System.out.println("------------------StartingTest---------------------------");
        System.out.println("The support.txt is : "+text.equals("To keep ReqRes free, contributions towards server costs are appreciated!"));
        System.out.println("------------------End of Test---------------------------");
    }

}
