package com.dkey.entity;

import java.util.HashMap;

public class Address {
    private HashMap country;
    private String region;
    private String district;
    private HashMap locality;
    private HashMap tstreet;
    private String street;
    private String house;
    private String housing;
    private String flat;

    public Address() {
    }

    public Address(HashMap country, String region, String district, HashMap locality, HashMap tstreet, String street, String house, String housing, String flat) {
        this.country = country;
        this.region = region;
        this.district = district;
        this.locality = locality;
        this.tstreet = tstreet;
        this.street = street;
        this.house = house;
        this.housing = housing;
        this.flat = flat;
    }

    public HashMap getCountry() {
        return country;
    }

    public void setCountry(HashMap country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public HashMap getLocality() {
        return locality;
    }

    public void setLocality(HashMap locality) {
        this.locality = locality;
    }

    public HashMap getTstreet() {
        return tstreet;
    }

    public void setTstreet(HashMap tstreet) {
        this.tstreet = tstreet;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getHousing() {
        return housing;
    }

    public void setHousing(String housing) {
        this.housing = housing;
    }

    public String getFlat() {
        return flat;
    }

    public void setFlat(String flat) {
        this.flat = flat;
    }
}
