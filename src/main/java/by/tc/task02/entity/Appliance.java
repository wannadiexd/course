package by.tc.task02.entity;

import java.io.Serializable;
import java.util.Objects;

public abstract  class Appliance implements Serializable {

    private int powerConsumption;
    private double height;
    private double weight;
    private double width;

    public Appliance() {
    }


    public Appliance(int powerConsumption, double height, double weight, double width) {
        this.powerConsumption = powerConsumption;
        this.height = height;
        this.weight = weight;
        this.width = width;
    }



    public Appliance(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }


    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Appliance appliance = (Appliance) o;
        return powerConsumption == appliance.powerConsumption &&
                Double.compare(appliance.height, height) == 0 &&
                Double.compare(appliance.weight, weight) == 0 &&
                Double.compare(appliance.width, width) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(powerConsumption, height, weight, width);
    }
    @Override
    public String toString() {
        return "powerConsumption=" + this.getPowerConsumption() +
                ", height=" + this.getHeight() +
                ", weight=" + this.getWeight() +
                ", width=" + this.getWidth() +
                '}';
    }
}
