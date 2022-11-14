package com.liliana.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
    private String Lastname;
    @Column

    private String name;
    @Column
    private String address;

    //Constructor vacio
    public Patient(){}

    //Constructor
    public Patient(Integer id, int idCard, String lastname, String name, String address) {
        this.id = id;
        this.idCard = idCard;
        Lastname = lastname;
        this.name = name;
        this.address = address;
    }

    //Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        id = id;
    }

    public int getIdCard(){
        return idCard;
    }
    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
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

    public int getIdNumber() {
        return idCard;
    }

    //Methods

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", idCard=" + idCard +
                ", Lastname='" + Lastname + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
