package ru.iukhimenko.vehiclestatusapi.services;

import ru.iukhimenko.vehiclestatusapi.assertions.AssertableResponse;

public class VehicleStatusApiService extends ApiService {
    public AssertableResponse getRoofTopStatus(String vehicleId) {
        return new AssertableResponse(getAuthorizedSpec()
                .pathParam("vehicleId", vehicleId)
                .get("/vehicles/{vehicleId}/resources/rooftopstatus")
        );
    }
}
