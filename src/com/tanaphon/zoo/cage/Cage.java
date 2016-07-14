package com.tanaphon.zoo.cage;

import com.tanaphon.zoo.animal.Animal;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tanaphon on 7/13/2016.
 */
public class Cage {
    private float humidityPercentage;
    private float temperatureFahrenheit;
    private float totalAreaMeterSquare;
    private float landAreaMeterSquare;
    private float waterAreaMeterSquare;
    private int animalNumber = 0;
    private String name;

    private List<Animal> animals = new ArrayList<>();

    public void importAnimal(Animal animal) {
        animals.add(animal);
        this.animalNumber++;
    }

    // ยังไม่เสร็จ
    public void exportAnimal(int amount) {

        this.animalNumber -= amount;
    }

    public Cage(float totalAreaMeterSquare, float landAreaMeterSquare, float waterAreaMeterSquare, String cageName) {
        if (validArea(totalAreaMeterSquare, landAreaMeterSquare, waterAreaMeterSquare)) {
            this.totalAreaMeterSquare = totalAreaMeterSquare;
            this.landAreaMeterSquare = landAreaMeterSquare;
            this.waterAreaMeterSquare = waterAreaMeterSquare;
            this.name = cageName;
            System.out.println(this.name + " is created.");
        } else {
            System.out.println("Can not create cage!");
        }
    }


    @Override
    public String toString() {
        String member = "";
        int i = 1;
        for (Animal animal : animals) {
            if (i == animals.size()) member += animal.getName()+"["+animal.getId()+"]";
            else member += animal.getName() +"["+ animal.getId()+"]" + ", ";
            i++;
        }
        return "Cage : " + name + " [" + member +
                "]," + " Animal Number = " + animalNumber;
    }

    public void updateHumidity() {

    }

    public void updateTemperature() {
    }


    public boolean validArea(float totalArea, float landArea, float waterArea) {
        return (landArea + waterArea) == totalArea;
    }

    public String getName() {
        return this.name;
    }

    public float getHumidityPercentage() {
        return humidityPercentage;
    }

    public float getTemperatureFahrenheit() {
        return temperatureFahrenheit;
    }

    public float getTotalAreaMeterSquare() {
        return totalAreaMeterSquare;
    }

    public float getLandAreaMeterSquare() {
        return landAreaMeterSquare;
    }

    public float getWaterAreaMeterSquare() {
        return waterAreaMeterSquare;
    }
}