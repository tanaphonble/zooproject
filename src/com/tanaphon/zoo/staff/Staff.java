package com.tanaphon.zoo.staff;

/**
 * Created by Tanaphon on 7/13/2016.
 */
public abstract class Staff {
    private static int next_id;
    private int id;
    private String name;
    private String gender;
    private String weight;
    private String height;
    private String dateOfBirth;
    private String telephoneNumber;
    private int salary;


    public Staff(String name, String gender, String dateOfBirth, String telephoneNumber, int salary) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.telephoneNumber = telephoneNumber;
        this.salary = salary;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
