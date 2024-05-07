package by.tc.task02.entity;

import java.util.Objects;

    public class AppProcessingUnit extends Appliance {
    private double displayInches;
    private double batteryCapacity;
    private int memoryrom;


    public AppProcessingUnit() {
    }


    public AppProcessingUnit(double displayInches, double batteryCapacity, int memoryrom) {
        this.displayInches = displayInches;
        this.batteryCapacity = batteryCapacity;
        this.memoryrom = memoryrom;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryrom() {
        return memoryrom;
    }

    public void setMemoryrom(int memoryrom) {
        this.memoryrom = memoryrom;
    }


    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppProcessingUnit that = (AppProcessingUnit) o;
        return Double.compare(that.displayInches, displayInches) == 0 &&
                Double.compare(that.batteryCapacity, batteryCapacity) == 0 &&
                memoryrom == that.memoryrom;
    }

    @Override
    public int hashCode() {

        return Objects.hash(displayInches, batteryCapacity, memoryrom);
    }

    @Override
    public String toString() {
        return  "displayInches=" + this.getDisplayInches() +
                ", ram=" + this.getMemoryrom() +
                '}';
    }

}
