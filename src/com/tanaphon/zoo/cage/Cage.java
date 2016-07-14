package com.tanaphon.zoo.cage;

import com.tanaphon.zoo.animal.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tanaphon on 7/13/2016.
 */
public class Cage {
    private static int next_id = 0;
    private int id;
    private float totalAreaMeterSquare;
    private float landAreaMeterSquare;
    private float waterAreaMeterSquare;
    private int animalNumber = 0;
    private boolean createSuccess = false;
    private String name;

    public boolean isCreateSuccess() {
        return createSuccess;
    }

    private List<Animal> animals = new ArrayList<>();

    public Cage(float totalAreaMeterSquare, float landAreaMeterSquare, float waterAreaMeterSquare, String cageName) {
        if (validArea(totalAreaMeterSquare, landAreaMeterSquare, waterAreaMeterSquare)) {
            this.totalAreaMeterSquare = totalAreaMeterSquare;
            this.landAreaMeterSquare = landAreaMeterSquare;
            this.waterAreaMeterSquare = waterAreaMeterSquare;
            this.name = cageName;
            this.id = ++next_id;
            System.out.println(this.name + " is created.");
            this.createSuccess = true;
        } else {
            System.out.println("Can not create cage!");
        }
    }

        public void importAnimal(Animal animal) {
        if (!animal.isInCage()) {
            animals.add(animal);
            animal.setInCage(true);
            this.animalNumber++;
        }else System.out.println("This animal is in Cage");
    }

    // ยังไม่เสร็จ
    public void exportAnimal(int amount) {

        this.animalNumber -= amount;
    }


    @Override
    public String toString() {
        String member = "";
        int i = 1;
        for (Animal animal : animals) {
            if (i == animals.size()) member += animal.getName() + "[" + animal.getId() + "]";
            else member += animal.getName() + "[" + animal.getId() + "]" + ", ";
            i++;
        }
        return "ID : " + id + " Cage : " + name + " [" + member +
                "]," + " Animal Number = " + animalNumber;
    }


    public boolean validArea(float totalArea, float landArea, float waterArea) {
        return (landArea + waterArea) == totalArea;
    }

    public String getName() {
        return this.name;
    }

}