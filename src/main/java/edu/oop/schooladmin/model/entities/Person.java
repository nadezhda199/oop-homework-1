package edu.oop.schooladmin.model.entities;

import java.time.LocalDate;

public abstract class Person {
    protected String firstName;
    protected String secondName;
    protected LocalDate birthDate;

    public Person(String firstName, String secondName, LocalDate birthDate) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthDate = birthDate;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    
    public LocalDate getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return firstName + ":" + secondName + ":" + birthDate.toString();
    }
}
