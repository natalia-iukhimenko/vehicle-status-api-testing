package ru.iukhimenko.vehiclestatusapi.services;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import static ru.iukhimenko.vehiclestatusapi.ProjectConfiguration.CONFIGURATION;

public class ApiService {
    public RequestSpecification getUnauthorizedSpec() {
        return RestAssured.given()
                .contentType(ContentType.JSON);
    }

    public RequestSpecification getAuthorizedSpec() {
        return getUnauthorizedSpec()
                .auth()
                .oauth2(CONFIGURATION.authToken());
    }
}
