package ru.iukhimenko.vehiclestatusapi;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;

import static ru.iukhimenko.vehiclestatusapi.ProjectConfiguration.CONFIGURATION;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ApiTest {
    @BeforeAll
    public void setup() {
        RestAssured.baseURI = CONFIGURATION.baseUrl();
    }
}
