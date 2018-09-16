package com.dkey.entity;

import java.time.LocalDate;
import java.util.HashMap;

public class Operation {
    private HashMap kind;
    private String number;
    private String dateTime;
    private HashMap organ;
    private String note;
    private String firstEnrolment;

    public Operation() {
    }

    public Operation(HashMap kind, String number, String dateTime, HashMap organ, String note, String firstEnrolment) {
        this.kind = kind;
        this.number = number;
        this.dateTime = dateTime;
        this.organ = organ;
        this.note = note;
        this.firstEnrolment = firstEnrolment;
    }

    public HashMap getKind() {
        return kind;
    }

    public void setKind(HashMap kind) {
        this.kind = kind;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public HashMap getOrgan() {
        return organ;
    }

    public void setOrgan(HashMap organ) {
        this.organ = organ;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getFirstEnrolment() {
        return firstEnrolment;
    }

    public void setFirstEnrolment(String firstEnrolment) {
        this.firstEnrolment = firstEnrolment;
    }
}
