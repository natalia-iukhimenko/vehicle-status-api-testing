package ru.iukhimenko.vehiclestatusapi.assertions;

import io.restassured.response.Response;
import ru.iukhimenko.vehiclestatusapi.conditions.Condition;

public class AssertableResponse {
    private final Response response;

    public AssertableResponse(Response response) {
        this.response = response;
    }

    public AssertableResponse shouldHave(Condition condition) {
        condition.check(response);
        return this;
    }

    public <T> T asObject(Class<T> aClass) {
        return response.as(aClass);
    }
}
