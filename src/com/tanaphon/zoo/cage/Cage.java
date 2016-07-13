package com.tanaphon.zoo.cage;

/**
 * Created by Tanaphon on 7/13/2016.
 */
public class Cage {
    private float humidityPercentage;
    private float temperatureFahrenheit;
    private float totalAreaMeterSquare;
    private float landAreaMeterSquare;
    private float waterAreaMeterSquare;

    public float getHumidityPercentage() {
        return humidityPercentage;
    }

    public void setHumidityPercentage(float humidityPercentage) {
        this.humidityPercentage = humidityPercentage;
    }

    public float getTemperatureFahrenheit() {
        return temperatureFahrenheit;
    }

    public void setTemperatureFahrenheit(float temperatureFahrenheit) {
        this.temperatureFahrenheit = temperatureFahrenheit;
    }

    public float getTotalAreaMeterSquare() {
        return totalAreaMeterSquare;
    }

    public void setTotalAreaMeterSquare(float totalAreaMeterSquare) {
        this.totalAreaMeterSquare = totalAreaMeterSquare;
    }

    public float getLandAreaMeterSquare() {
        return landAreaMeterSquare;
    }

    public void setLandAreaMeterSquare(float landAreaMeterSquare) {
        this.landAreaMeterSquare = landAreaMeterSquare;
    }

    public float getWaterAreaMeterSquare() {
        return waterAreaMeterSquare;
    }

    public void setWaterAreaMeterSuare(float waterAreaMeterSuare) {
        this.waterAreaMeterSquare = waterAreaMeterSuare;
    }
}
