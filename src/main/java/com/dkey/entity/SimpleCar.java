package com.dkey.entity;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;


public class SimpleCar {
    private String vin;
    private String brand;
    private String makeYear;
    private HashMap kind;

    public SimpleCar() {
    }

    public SimpleCar(String vin, String brand, String makeYear, HashMap kind) {
        this.vin = vin;
        this.brand = brand;
        this.makeYear = makeYear;
        this.kind = kind;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMakeYear() {
        return makeYear;
    }

    public void setMakeYear(String makeYear) {
        this.makeYear = makeYear;
    }

    public HashMap getKind() {
        return kind;
    }

    public void setKind(HashMap kind) {
        this.kind = kind;
    }
}
