package com.dkey.entity;

import java.util.HashMap;

public class Vehicle {
    private HashMap category;
    private String makeYear;
    private HashMap brand;
    private HashMap model;
    private String vin;
    private String engineNumber;
    private String chassisNumber;
    private String cabNumber;
    private HashMap color;

    public Vehicle() {
    }

    public Vehicle(HashMap category, String makeYear, HashMap brand, HashMap model, String vin, String engineNumber, String chassisNumber, String cabNumber, HashMap color) {
        this.category = category;
        this.makeYear = makeYear;
        this.brand = brand;
        this.model = model;
        this.vin = vin;
        this.engineNumber = engineNumber;
        this.chassisNumber = chassisNumber;
        this.cabNumber = cabNumber;
        this.color = color;
    }

    public HashMap getCategory() {
        return category;
    }

    public void setCategory(HashMap category) {
        this.category = category;
    }

    public String getMakeYear() {
        return makeYear;
    }

    public void setMakeYear(String makeYear) {
        this.makeYear = makeYear;
    }

    public HashMap getBrand() {
        return brand;
    }

    public void setBrand(HashMap brand) {
        this.brand = brand;
    }

    public HashMap getModel() {
        return model;
    }

    public void setModel(HashMap model) {
        this.model = model;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public String getCabNumber() {
        return cabNumber;
    }

    public void setCabNumber(String cabNumber) {
        this.cabNumber = cabNumber;
    }

    public HashMap getColor() {
        return color;
    }

    public void setColor(HashMap color) {
        this.color = color;
    }
}
