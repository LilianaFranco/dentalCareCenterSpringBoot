package com.liliana.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table
public class Patient {

    //Properties
    @Id
    @Column
    private Integer id;
    @Column
    private int idCard;
    @Column
    private String lastName;
    @Column
    private String name;
    @Column
    private String address;
    @Column
    private Date registrationDate;

    //Constructor vacio
    public Patient(){}

    //Constructor

    public Patient(Integer id, int idCard, String lastName, String name, String address, Date registrationDate) {
        this.id = id;
        this.idCard = idCard;
        this.lastName = lastName;
        this.name = name;
        this.address = address;
        this.registrationDate = registrationDate;
    }


    //Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }


    //Methods


    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", idCard=" + idCard +
                ", lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", registrationDate=" + registrationDate +
                '}';
    }
}

