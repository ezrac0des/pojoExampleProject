package requests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import pojos.CreateIndividualSessionPOJO;
import testData.Hypnotes;

import static io.restassured.RestAssured.given;

public class CreateIndividualSession extends Hypnotes {

    @Test
    public void test(){
        String endpoint ="settings/meeting/category/add";

        CreateIndividualSessionPOJO requestBody = new CreateIndividualSessionPOJO("Yeni", 100, 1, 60, 30, 30, 1, 1, "ucret sabittir");
        System.out.println(requestBody);

        CreateIndividualSessionPOJO expectedResponse = new CreateIndividualSessionPOJO(true);
        System.out.println(expectedResponse);

        Response response = given().
                spec(spec01)
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .post(endpoint);

        response.prettyPrint();


    }
}
