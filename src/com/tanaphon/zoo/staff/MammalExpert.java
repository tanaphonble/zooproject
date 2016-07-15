package com.tanaphon.zoo.staff;

import com.tanaphon.zoo.staffInterface.ReptileDoctor;

/**
 * Created by Tanaphon on 7/13/2016.
 */
public class MammalExpert extends Doctor implements ReptileDoctor {
    public MammalExpert(String name, String gender, String dateOfBirth, String telephoneNumber, int salary) {
        super(name, gender, dateOfBirth, telephoneNumber, salary);
    }

    @Override
    public void superCureReptile() {

    }
}
