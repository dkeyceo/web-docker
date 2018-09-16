package com.dkey.entity;

public class Person {
    private String surname;
    private String name;
    private String middlename;
    private String birthday;
    private String sex;
    private String pin;
    private String phone;
    private PersonDocument personDocument;

    public Person() {
    }

    public Person(String surname, String name, String middlename, String birthday, String sex, String pin, String phone, PersonDocument personDocument) {
        this.surname = surname;
        this.name = name;
        this.middlename = middlename;
        this.birthday = birthday;
        this.sex = sex;
        this.pin = pin;
        this.phone = phone;
        this.personDocument = personDocument;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public PersonDocument getPersonDocument() {
        return personDocument;
    }

    public void setPersonDocument(PersonDocument personDocument) {
        this.personDocument = personDocument;
    }
}
