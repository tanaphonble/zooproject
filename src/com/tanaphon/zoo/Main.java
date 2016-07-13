package com.tanaphon.zoo;


import com.tanaphon.zoo.animal.Animal;
import com.tanaphon.zoo.animal.Mammal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tanaphon on 7/13/2016.
 */
public class Main {
    public static void main(String[] args){
        List<Animal> tigers = new ArrayList<>();
        Mammal tiger1 = new Mammal("top","01-021-01","male","21rgfuvisudvne");
        Mammal tiger2 = new Mammal("top","01-021-01","male","21rgfuvisudvne");
        Mammal tiger3 = new Mammal("top","01-021-01","male","21rgfuvisudvne");
        Mammal tiger4 = new Mammal("top","01-021-01","male","21rgfuvisudvne");

        tigers.add(tiger1);
        tigers.add(tiger2);
        tigers.add(tiger3);
        tigers.add(tiger4);

        for( Animal animal : tigers){
            System.out.println(animal.toString());
        }


    }
}









