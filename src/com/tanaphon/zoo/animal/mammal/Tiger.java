package com.tanaphon.zoo.animal.mammal;

import com.tanaphon.zoo.animal.Mammal;
import com.tanaphon.zoo.animalinterface.Climbable;
import com.tanaphon.zoo.animalinterface.Swimable;

/**
 * Created by Tanaphon on 7/13/2016.
 */
public class Tiger extends Mammal implements Climbable, Swimable {
    public Tiger(String dateOfBirth, String gender, String id) {
        super(dateOfBirth, gender, id);
    }

    public Tiger(String name, String dateOfBirth, String gender, String id) {
        super(name, dateOfBirth, gender, id);
    }

    @Override
    public void climb() {

    }

    @Override
    public void swim() {

    }
}
