package com.tanaphon.zoo;

import com.tanaphon.zoo.animal.Carnivore;

/**
 * Created by Tanaphon on 7/13/2016.
 */
public class Main {
    public static void main(String[] args){
        Carnivore tiger = new Carnivore("ble","24-08-22","male","qwetsdgFGKFGDGDJGT");
        tiger.move();
        tiger.defecate();
        tiger.sleep();
        tiger.howl();
    }
}
