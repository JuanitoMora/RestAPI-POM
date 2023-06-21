package com.sophossolutions.apis;

import com.sophossolutions.restinteractions.RestInteractions;
import io.cucumber.datatable.DataTable;

public class GoRestApi {
    private static final String token = "3b6433cfe9ee09390ef3ae30e3c113b80de8ee46795311b0b14e25ce8a941c89";
    private static String pathName = "data.name";
    private static String pathId = "data.id";
    private static String pathEmail = "data.email";

    public static void setBaseUrl(String baseUrl) {
        RestInteractions.setBaseURL(baseUrl);
    }

    public static void executionGetToken(String endpoint, String idUser) {
        RestInteractions.executionGetToken(endpoint, idUser, token);
    }

    public static void validateResponse(Integer statusCode, String name) {
        RestInteractions.validateStatusCode(statusCode);
        RestInteractions.validateDataResponse(name, pathName);
    }

    public static void executionPostToken(String endpoint, DataTable userInformation) {
        RestInteractions.executionPostToken(endpoint, userInformation.asMap(String.class, String.class), token);
    }

    public static void editInformation(String endpoint, String id, DataTable userInformation) {
        RestInteractions.editInformation(endpoint, id, userInformation.asMap(String.class, String.class), token);
    }

    public static void validateInformationModificated(String id, String name, String email) {
        RestInteractions.validateId(id, pathId);
        RestInteractions.validateDataResponse(name, pathName);
        RestInteractions.validateEmail(email, pathEmail);
    }

    public static void deleteInformation(String endpoint, String id, DataTable userID) {
        RestInteractions.deleteInformation(endpoint, id, userID.asMap(String.class, String.class), token);
    }

    public static void validateStatusDelete(Integer statusCode) {
        RestInteractions.validateStatusDelete(statusCode);
    }
}
