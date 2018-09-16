package com.dkey.entity;

import java.util.HashMap;

public class LicensePlate {
    private HashMap kind;
    private String value;

    public LicensePlate() {
    }

    public LicensePlate(HashMap kind, String value) {
        this.kind = kind;
        this.value = value;
    }

    public HashMap getKind() {
        return kind;
    }

    public void setKind(HashMap kind) {
        this.kind = kind;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
