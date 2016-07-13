package com.tanaphon.zoo.animal;

import java.util.List;

/**
 * Created by Tanaphon on 7/12/2016.
 */
public abstract class Animal {
    // สัตว์
    private String name;
    private String dateOfBirth;
    private String gender;
    private String id;



    public Animal(String dateOfBirth, String gender, String id) {
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.id = id;
    }

    public Animal(String name, String dateOfBirth, String gender, String id) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.id = id;
    }

    @Override
    public String toString() {
        return "name=" + name + ", dateOfBirth=" + dateOfBirth +
                ", gender=" + gender + ", id=" + id ;
    }

    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public String getId() {return id;}


    public void setName(String name) {
        this.name = name;
    }

    public void eat() {
        // กินอาหาร
    }

    public void defecate() {
        // ถ่ายอุจจาระ
    }

    public void move() {
        // เคลื่อนที่
    }

    public void sleep() {
        // นอนหลับ
    }


    public void reproductive(){
        // สืบพันธุ์
    }

    public void sick(){
        // ป่วย
    }

    public void dead(){
        // ตาย
    }
}
