package com.sofkau.util;

public enum LimitTimeWait {

    ONE_SECONDS(1),
    FIVE_SECONDS(5),
    TEN_SECONDS(10),
    THIRTY_SECONDS(30),
    ONE_MINUT(60);

    private final int value;

    LimitTimeWait(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
