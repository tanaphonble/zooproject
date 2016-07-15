package com.tanaphon.zoo.staff;

import com.tanaphon.zoo.staffInterface.BirdDoctor;

/**
 * Created by Tanaphon on 7/13/2016.
 */
public class Doctor extends Staff  {
    public Doctor(String name, String gender, String dateOfBirth, String telephoneNumber, int salary) {
        super(name, gender, dateOfBirth, telephoneNumber, salary);
    }

    public void basicCure(){
        // รักษา
    }

    public void firstAid(){
        // ปฐมพยาบาล
    }

    public void dosage(){
        // ให้ยา
    }
}
