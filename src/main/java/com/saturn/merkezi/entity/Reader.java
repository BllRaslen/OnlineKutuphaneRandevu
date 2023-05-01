package com.saturn.merkezi.entity;


import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "readers")
public class Reader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private int age;

    private String citizen;

    private String phoneNumber;

    @Column(length = 1000)
    private String noteArea;

    @Column(name = "creation_time")
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime creationTime;



    public Reader(String name, int age, String citizen, String phoneNumber, String noteArea) {
        this.name = name;
        this.age = age;
        this.citizen = citizen;
        this.phoneNumber = phoneNumber;
        this.noteArea = noteArea;
    }

    public Reader() {

    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {

        this.creationTime = creationTime;
    }

    public Reader(String name, int age, String citizen, String phoneNumber, String noteArea, String s) {

    }


// getters and setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCitizen() {
        return citizen;
    }

    public void setCitizen(String citizen) {
        this.citizen = citizen;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNoteArea() {
        return noteArea;
    }

    public void setNoteArea(String noteArea) {
        this.noteArea = noteArea;
    }
}

