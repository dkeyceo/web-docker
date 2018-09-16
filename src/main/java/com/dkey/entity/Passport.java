package com.dkey.entity;

import java.util.HashMap;

public class Passport {
    private HashMap kind;
    private String seria;
    private Integer number;

    public Passport() {
    }

    public Passport(HashMap kind, String seria, Integer number) {
        this.kind = kind;
        this.seria = seria;
        this.number = number;
    }

    public HashMap getKind() {
        return kind;
    }

    public void setKind(HashMap kind) {
        this.kind = kind;
    }

    public String getSeria() {
        return seria;
    }

    public void setSeria(String seria) {
        this.seria = seria;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}
