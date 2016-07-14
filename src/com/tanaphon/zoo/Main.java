package com.tanaphon.zoo;

import com.tanaphon.zoo.animal.Animal;
import com.tanaphon.zoo.animal.Mammal;
import com.tanaphon.zoo.cage.Cage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tanaphon on 7/13/2016.
 */
public class Main {
    public static void main(String[] args){
        ManageZoo manageZoo = new ManageZoo();
        manageZoo.initializeZoo();
        manageZoo.zooManagementSystem();
    }
}
