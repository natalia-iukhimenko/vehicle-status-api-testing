package ru.iukhimenko.vehiclestatusapi.responses;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class ErrorResponse {
    @JsonProperty("exveErrorId")
    private String errorId;
    @JsonProperty("exveErrorMsg")
    private String errorMsg;
    @JsonProperty("exveErrorRef")
    private String errorRef;
}
