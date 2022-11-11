package com.liliana.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Dentist {

    //Properties
    @Id
    @Column
    private Integer id;
    @Column
    private int dentalLicense;
    @Column
    private String lastName;
    @Column
    private String name;

    //Constructor
    public Dentist(int id, int dentalLicense, String lastName, String name) {
        this.id = id;
        this.dentalLicense = dentalLicense;
        this.lastName = lastName;
        this.name = name;
    }

    //Constructor vacio
    public Dentist() { }

    //Getters and Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDentalLicense() {
        return dentalLicense;
    }

    public void setDentalLicense(int dentalLicense) {
        this.dentalLicense = dentalLicense;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Methods

    @Override
    public String toString() {
        return "Dentist{" +
                "id=" + id +
                ", dentalLicense=" + dentalLicense +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
