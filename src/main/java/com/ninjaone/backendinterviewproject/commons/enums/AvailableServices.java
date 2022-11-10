package com.ninjaone.backendinterviewproject.commons.enums;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum AvailableServices {

    ANTIVIRUS(0, "Antivirus", BigDecimal.valueOf(5), BigDecimal.valueOf(7)),
    BACKUP(1, "Backup", BigDecimal.valueOf(3), BigDecimal.valueOf(3)),
    PSA(2, "PSA", BigDecimal.valueOf(2), BigDecimal.valueOf(2)),
    SCREEN_SHARE(3, "Screen Share", BigDecimal.valueOf(1), BigDecimal.valueOf(1));

    @Getter
    private Integer code;
    @Getter
    private String name;
    @Getter
    private BigDecimal winCost;
    @Getter
    private BigDecimal macCost;

    @Override
    public String toString() {
        return String.format("(%s) - %s - windows cost: %s - mac cost: %s", code, name, winCost, macCost);
    }
}
