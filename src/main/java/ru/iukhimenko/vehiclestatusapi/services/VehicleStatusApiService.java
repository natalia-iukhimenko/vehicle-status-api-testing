package ru.iukhimenko.vehiclestatusapi.services;

import ru.iukhimenko.vehiclestatusapi.assertions.AssertableResponse;
import ru.iukhimenko.vehiclestatusapi.responses.RoofTopStatusResponse;

public class VehicleStatusApiService extends ApiService {
    public AssertableResponse getRoofTopStatusResponse(String vehicleId) {
        return new AssertableResponse(getAuthorizedSpec()
                .pathParam("vehicleId", vehicleId)
                .get("/vehicles/{vehicleId}/resources/rooftopstatus")
        );
    }

    public RoofTopStatusResponse getRoofTopStatus(String vehicleId) {
        return getRoofTopStatusResponse(vehicleId)
                .asObject(RoofTopStatusResponse.class);
    }
}
