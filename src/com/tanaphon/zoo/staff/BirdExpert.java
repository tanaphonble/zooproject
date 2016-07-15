package com.tanaphon.zoo.staff;

import com.tanaphon.zoo.staffInterface.BirdDoctor;

/**
 * Created by Tanaphon on 7/13/2016.
 */
public class BirdExpert extends Doctor implements BirdDoctor {
    public BirdExpert(String name, String gender, String dateOfBirth, String telephoneNumber, int salary) {
        super(name, gender, dateOfBirth, telephoneNumber, salary);
    }

    @Override
    public void superCureBird() {

    }
}
