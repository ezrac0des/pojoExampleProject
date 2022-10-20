package requests;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;
import org.junit.Test;
import pojos.OrderBookPOJO;
import testData.SimpleBook;

import static io.restassured.RestAssured.given;

public class OrderBook extends SimpleBook {
    //spec, beforeMethodu

    @Test
    public void test(){
        spec.pathParam("param1", "orders");

        OrderBookPOJO requestBody = new OrderBookPOJO(5,"John Doe");
        System.out.println(requestBody);

        OrderBookPOJO responseExpected = new OrderBookPOJO(true);
        System.out.println(responseExpected);

        Response response = given()
                .contentType(ContentType.JSON)
                .spec(spec)
                .body(requestBody)
                .when()
                .post("/{param1}");

        response.prettyPrint();
        

        //De-serialization -> json to object
        OrderBookPOJO actualResponse = response.as(OrderBookPOJO.class);
        System.out.println(actualResponse);

        Assert.assertEquals(201, response.getStatusCode());
        Assert.assertEquals(responseExpected.isCreated(), actualResponse.isCreated());
    }
}
