package ru.iukhimenko.vehiclestatusapi.enums;

import lombok.Getter;

@Getter
public enum RoofTopStatusEnum {
    UNLOCKED("0"),
    OPEN_AND_LOCKED("1"),
    CLOSED_AND_LOCKED("2");

    private final String value;

    RoofTopStatusEnum(String value) {
        this.value = value;
    }
}
