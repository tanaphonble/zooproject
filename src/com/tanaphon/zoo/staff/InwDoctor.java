package com.tanaphon.zoo.staff;

import com.tanaphon.zoo.staffInterface.*;

/**
 * Created by Tanaphon on 7/13/2016.
 */
public class InwDoctor extends Doctor implements BirdDoctor, MammalDoctor, ReptileDoctor, FishDoctor, InsectDoctor, InwSkill {
    public InwDoctor(String name, String gender, String dateOfBirth, String telephoneNumber, int salary) {
        super(name, gender, dateOfBirth, telephoneNumber, salary);
    }

    @Override
    public void superCureReptile() {

    }

    @Override
    public void superCureMammal() {

    }

    @Override
    public void resurrect() {

    }

    @Override
    public void superCureInsec() {

    }

    @Override
    public void superCureFish() {

    }

    @Override
    public void superCureBird() {

    }
}
