package ru.iukhimenko.vehiclestatusapi.tests;

import org.apache.http.HttpStatus;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.iukhimenko.vehiclestatusapi.ApiTest;
import ru.iukhimenko.vehiclestatusapi.enums.RoofTopStatusEnum;
import ru.iukhimenko.vehiclestatusapi.models.Resource;
import ru.iukhimenko.vehiclestatusapi.responses.ErrorResponse;
import ru.iukhimenko.vehiclestatusapi.services.VehicleStatusApiService;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static ru.iukhimenko.vehiclestatusapi.conditions.StandardConditions.statusCode;

public class RoofTopStatusTest extends ApiTest {
    private final VehicleStatusApiService vehicleStatusApiService = new VehicleStatusApiService();

    @ParameterizedTest()
    @ValueSource(strings = {"WDB111111ZZZ22222"})
    public void checkRoofStatusUnlocked(String vehicleId) {
        Resource status = vehicleStatusApiService.getRoofTopStatus(vehicleId).roofTopStatus();
        assertThat(status.timestamp(), is(not(nullValue())));
        assertThat(status.value(), equalTo(RoofTopStatusEnum.UNLOCKED.getValue()));
    }

    @ParameterizedTest()
    @ValueSource(strings = {"123"})
    public void checkGettingStatusForInvalidVehicle(String vehicleId) {
        ErrorResponse response = vehicleStatusApiService.getRoofTopStatusResponse(vehicleId)
                .shouldHave(statusCode(HttpStatus.SC_NOT_FOUND))
                .asObject(ErrorResponse.class);
        assertThat(response.getErrorId(), is(not(nullValue())));
        assertThat(response.getErrorMsg(), is(not(nullValue())));
        assertThat(response.getErrorRef(), is(not(nullValue())));
    }
}
