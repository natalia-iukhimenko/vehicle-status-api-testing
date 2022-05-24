package ru.iukhimenko.vehiclestatusapi.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;
import ru.iukhimenko.vehiclestatusapi.models.Resource;

@Data
@Accessors(fluent = true)
public class RoofTopStatusResponse {
    @JsonProperty("rooftopstatus")
    private Resource roofTopStatus;
}
