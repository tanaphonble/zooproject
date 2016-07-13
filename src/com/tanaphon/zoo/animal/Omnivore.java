package com.tanaphon.zoo.animal;

/**
 * Created by Tanaphon on 7/12/2016.
 */
public class Omnivore extends Animal {
    // สัตว์กินเนื้อและพืช
    public Omnivore(String dateOfBirth, String gender, String id) {
        super(dateOfBirth, gender, id);
    }

    public Omnivore(String name, String dateOfBirth, String gender, String id) {
        super(name, dateOfBirth, gender, id);
    }
}
