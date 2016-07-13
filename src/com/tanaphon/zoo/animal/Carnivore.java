package com.tanaphon.zoo.animal;

/**
 * Created by Tanaphon on 7/12/2016.
 */
public class Carnivore extends Animal {
    // สัตว์กินเนื้อ
    public Carnivore(String dateOfBirth, String gender, String id) {
        super(dateOfBirth, gender, id);
    }

    public Carnivore(String name, String dateOfBirth, String gender, String id) {
        super(name, dateOfBirth, gender, id);
    }

    public void howl(){}
}
