package com.tanaphon.zoo.animal.bird;

import com.tanaphon.zoo.animal.Bird;
import com.tanaphon.zoo.animalinterface.Flyable;

/**
 * Created by Tanaphon on 7/13/2016.
 */
public class Parrot extends Bird implements Flyable {
    public Parrot(String name, String dateOfBirth, String gender, String id) {
        super(name, dateOfBirth, gender, id);
    }

    @Override
    public void fly() {

    }
}
