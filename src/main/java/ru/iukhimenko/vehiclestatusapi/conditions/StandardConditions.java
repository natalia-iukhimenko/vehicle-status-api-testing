package ru.iukhimenko.vehiclestatusapi.conditions;

import lombok.experimental.UtilityClass;

@UtilityClass
public class StandardConditions {
    public StatusCodeCondition statusCode(int code) {
        return new StatusCodeCondition(code);
    }
}
