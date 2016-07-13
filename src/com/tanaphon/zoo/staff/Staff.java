package com.tanaphon.zoo.staff;

/**
 * Created by Tanaphon on 7/13/2016.
 */
public abstract class Staff {
    private String name;
    private String gender;
    private String weight;
    private String height;
    private String dateOfBirth;
    private String telephoneNumber;
    private String salary;
    private String healthStatus;

    public String getHealthStatus(){
        return healthStatus;
    }

    public void setHealthStatus(String healthStatus){
        this.healthStatus = healthStatus;
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

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}
