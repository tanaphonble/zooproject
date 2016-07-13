package com.tanaphon.zoo.animal.bird;

import com.tanaphon.zoo.animal.Bird;
import com.tanaphon.zoo.animalinterface.Swimable;

/**
 * Created by Tanaphon on 7/13/2016.
 */
public class Duck extends Bird implements Swimable {
    public Duck(String dateOfBirth, String gender, String id) {
        super(dateOfBirth, gender, id);
    }

    public Duck(String name, String dateOfBirth, String gender, String id) {
        super(name, dateOfBirth, gender, id);
    }

    @Override
    public void swim() {

    }
}
