package com.dkey.entity;

import java.util.HashMap;

public class PersonDocument {
    private HashMap documentKind;
    private String seria;
    private String number;
    private String date;
    private String organ;

    public PersonDocument() {
    }

    public PersonDocument(HashMap documentKind, String seria, String number, String date, String organ) {
        this.documentKind = documentKind;
        this.seria = seria;
        this.number = number;
        this.date = date;
        this.organ = organ;
    }

    public HashMap getDocumentKind() {
        return documentKind;
    }

    public void setDocumentKind(HashMap documentKind) {
        this.documentKind = documentKind;
    }

    public String getSeria() {
        return seria;
    }

    public void setSeria(String seria) {
        this.seria = seria;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOrgan() {
        return organ;
    }

    public void setOrgan(String organ) {
        this.organ = organ;
    }
}
