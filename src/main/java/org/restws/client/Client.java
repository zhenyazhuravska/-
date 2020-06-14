package org.restws.client;

import io.restassured.filter.log.LogDetail;
import io.restassured.http.ContentType;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import static io.restassured.RestAssured.given;

public class Client {
    public static void main(String[] args) {
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .setBaseUri("http://localhost")
                .setPort(8080)
                .setBasePath("/restws-1.0-SNAPSHOT")
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .log(LogDetail.ALL)
                .build();
        given().when().get("/theaters").prettyPrint();
    }
}