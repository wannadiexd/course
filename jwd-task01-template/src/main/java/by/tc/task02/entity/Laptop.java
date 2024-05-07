package by.tc.task02.entity;

import java.util.Objects;

public class Laptop extends AppProcessingUnit {

    private String os;
    private double cpu;
    private int systemMemory;

    public Laptop() {
    }

    public Laptop(double batteryCapacity, String osName, int  memoryrom, int systemMemory, double cpu, double displayInches) {
        super(batteryCapacity, displayInches,  memoryrom);
        this.os = osName;
        this.cpu = cpu;
        this.systemMemory = systemMemory;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String osName) {
        this.os = os;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.cpu, cpu) == 0 &&
                systemMemory == laptop.systemMemory &&
                Objects.equals(os, laptop.os);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), os, cpu, systemMemory);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "osName='" + this.getOs() + '\'' +
                ", cpu=" + this.getCpu() +
                ", systemMemory=" + this.getSystemMemory() +
                '}'+super.toString();
    }


}
