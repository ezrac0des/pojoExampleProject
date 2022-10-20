package testData;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import utilities.ConfigurationReader;

public class SimpleBook {
    protected RequestSpecification spec;
    //kendi bulundugu sinifa ve inherit edildigi sinifa
    @Before
    public void setUp(){
        spec= new RequestSpecBuilder()
                .addHeader("Authorization","Bearer " + ConfigurationReader.getProperty("bearerToken"))
                .setBaseUri(ConfigurationReader.getProperty("baseUrl"))
                .setRelaxedHTTPSValidation()
                .build();
    }

}
