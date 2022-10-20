package testData;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.Cookie;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import utilities.ConfigurationReader;

public class Hypnotes {
    protected RequestSpecification spec01;

    @Before
    public void setUp(){
        spec01 = new RequestSpecBuilder()
                .addCookie(new Cookie.Builder("PHPSESSID", ConfigurationReader.getProperty("cookie")).build())
                .setBaseUri("https://test.hypnotes.net/api/")
                .setRelaxedHTTPSValidation()
                .build();
    }
}
