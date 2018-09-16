package com.dkey.entity;

public class Owner {
    private Person person;
    private Organization organization;

    public Owner(Person person) {
        this.person = person;
    }

    public Owner(Organization organization) {
        this.organization = organization;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }
}
