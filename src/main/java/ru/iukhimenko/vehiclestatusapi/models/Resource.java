package ru.iukhimenko.vehiclestatusapi.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = true)
public class Resource {
    @JsonProperty("timestamp")
    private Long timestamp;
    @JsonProperty("value")
    private String value;
}
