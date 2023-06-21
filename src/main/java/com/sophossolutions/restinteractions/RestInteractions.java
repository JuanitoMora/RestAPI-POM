package com.sophossolutions.restinteractions;

import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import org.junit.Assert;

import java.util.Map;

public class RestInteractions {

    private static String baseUrl;

    public static void setBaseURL(String baseUrl) {
        RestInteractions.baseUrl = baseUrl;
    }

    public static void executionGetToken(String endpoint, String idUser, String token) {
        SerenityRest.given().auth().oauth2(token).contentType(ContentType.JSON).when()
                .get(baseUrl.concat(endpoint).concat(idUser));
        SerenityRest.lastResponse().prettyPeek();
    }

    public static void validateStatusCode(Integer statusCode) {
        Integer statusActual = SerenityRest.lastResponse().getStatusCode();
        Assert.assertEquals(statusCode, statusActual);
    }

    public static void validateDataResponse(String name, String pathName) {
        String actual = SerenityRest.lastResponse().jsonPath().getString(pathName);
        Assert.assertEquals(name, actual);
    }

    public static void executionPostToken(String endpoint, Map<String, String> asMap, String token) {
        SerenityRest.given().auth().oauth2(token).contentType(ContentType.JSON).when()
                .body(asMap).post(baseUrl.concat(endpoint));
        SerenityRest.lastResponse().prettyPeek();
    }

    public static void editInformation(String endpoint, String id, Map<Object, Object> asMap, String token) {
        SerenityRest.given().auth().oauth2(token).contentType(ContentType.JSON).when()
                .body(asMap).put(baseUrl.concat(endpoint).concat(id));
        SerenityRest.lastResponse().prettyPeek();
    }

    public static void validateId(String id, String pathId) {
        String idActual=SerenityRest.lastResponse().jsonPath().getString(pathId);
        Assert.assertEquals(id,idActual);
    }

    public static void validateEmail(String email, String pathEmail) {
        String emailActual=SerenityRest.lastResponse().jsonPath().getString(pathEmail);
        Assert.assertEquals(email,emailActual);
    }

    public static void deleteInformation(String endpoint, String id, Map<String, String> asMap, String token) {
        SerenityRest.given().auth().oauth2(token).contentType(ContentType.JSON).when()
                .body(asMap).delete(baseUrl.concat(endpoint).concat(id));
        SerenityRest.lastResponse().prettyPeek();
    }

    public static void validateStatusDelete(Integer statusCode) {
        Integer statusActual = SerenityRest.lastResponse().getStatusCode();
        Assert.assertEquals(statusCode, statusActual);
    }
}