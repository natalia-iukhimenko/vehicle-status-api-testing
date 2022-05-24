package ru.iukhimenko.vehiclestatusapi.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.iukhimenko.vehiclestatusapi.ApiTest;
import ru.iukhimenko.vehiclestatusapi.enums.RoofTopStatusEnum;
import ru.iukhimenko.vehiclestatusapi.models.Resource;
import ru.iukhimenko.vehiclestatusapi.services.VehicleStatusApiService;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class RoofTopStatusTests extends ApiTest {
    private final VehicleStatusApiService vehicleStatusApiService = new VehicleStatusApiService();

    @ParameterizedTest()
    @ValueSource(strings = {"WDB111111ZZZ22222"})
    public void checkRoofStatusUnlocked(String vehicleId) {
        Resource status = vehicleStatusApiService.getRoofTopStatus(vehicleId).roofTopStatus();
        assertThat(status.timestamp(), is(not(nullValue())));
        assertThat(status.value(), equalTo(RoofTopStatusEnum.UNLOCKED.getValue()));
    }
}
