package com.ninjaone.backendinterviewproject.commons.enums;

import java.util.stream.Stream;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum DeviceType {
    WIN_WORKSTATION(0, "Windows Workstation"),
    WIN_SERVER(1, "Windows Server"),
    MAC(2, "Mac");

    @Getter
    private Integer code;
    @Getter
    private String name;

    public static DeviceType of(int code) {
        return Stream.of(values()).filter(type -> type.code == code).findFirst()
                .orElseThrow(() -> new RuntimeException());
    }

    @Override
    public String toString() {
        return String.format("(%s) - %s", code, name);
    }

}
