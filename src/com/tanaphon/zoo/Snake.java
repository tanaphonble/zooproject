package com.tanaphon.zoo;

import com.tanaphon.zoo.animal.Carnivore;
import com.tanaphon.zoo.animalInterface.Reptile;

/**
 * Created by Tanaphon on 7/12/2016.
 */
public class Snake extends Carnivore implements Reptile {
    // งู
    public Snake(String dateOfBirth, String gender, String id) {
        super(dateOfBirth, gender, id);
    }

    @Override
    public void crawl() {

    }
}
