package by.tc.task02.entity;

import java.util.Objects;

public class Refrigerator extends Appliance {

    private double freezerCapacity;
    private double overallCapacity;

    public Refrigerator() {
    }

    public Refrigerator(int powerConsumption,double weight,double freezerCapacity,double overallCapacity, double height,  double width  ) {
        super(powerConsumption, height, weight, width);
        this.freezerCapacity = freezerCapacity;
        this.overallCapacity = overallCapacity;
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(double freezeCapacity) {
        this.freezerCapacity = freezeCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Refrigerator that = (Refrigerator) o;
        return Double.compare(that.freezerCapacity, freezerCapacity) == 0 &&
                Double.compare(that.overallCapacity, overallCapacity) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), freezerCapacity, overallCapacity);
    }

    @Override
    public String toString() {
        return "Refrigerator{" +
                "freezeCapacity=" + this.getFreezerCapacity() +
                ", overallCapacity=" + this.getOverallCapacity() +
                '}'+super.toString();
    }


}
