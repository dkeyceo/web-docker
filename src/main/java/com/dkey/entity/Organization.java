package com.dkey.entity;

public class Organization {
    private String fullName;
    private String shortName;
    private String edrpou;

    public Organization() {
    }

    public Organization(String fullName, String shortName, String edrpou) {
        this.fullName = fullName;
        this.shortName = shortName;
        this.edrpou = edrpou;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getEdrpou() {
        return edrpou;
    }

    public void setEdrpou(String edrpou) {
        this.edrpou = edrpou;
    }
}
