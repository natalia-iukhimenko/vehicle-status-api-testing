package ru.iukhimenko.vehiclestatusapi.services;

import org.apache.http.HttpStatus;
import ru.iukhimenko.vehiclestatusapi.assertions.AssertableResponse;
import ru.iukhimenko.vehiclestatusapi.responses.RoofTopStatusResponse;

import static ru.iukhimenko.vehiclestatusapi.conditions.StandardConditions.statusCode;

public class VehicleStatusApiService extends ApiService {
    public AssertableResponse getRoofTopStatusResponse(String vehicleId) {
        return new AssertableResponse(getAuthorizedSpec()
                .pathParam("vehicleId", vehicleId)
                .get("/vehicles/{vehicleId}/resources/rooftopstatus")
        );
    }

    public RoofTopStatusResponse getRoofTopStatus(String vehicleId) {
        return getRoofTopStatusResponse(vehicleId)
                .shouldHave(statusCode(HttpStatus.SC_OK))
                .asObject(RoofTopStatusResponse.class);
    }
}
