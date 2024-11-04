package lab2.Task4;

import lab2.Task1.Intensity;
import lab2.Task2.Coffee;

public class Americano extends Coffee {
    private final int mlOfWater;
    protected final String name = "Americano";

    public Americano(Intensity intensity, int mlOfWater) {
        super(intensity);
        this.mlOfWater = mlOfWater;
    }

    public Americano makeAmericano() {
        System.out.println("Making " + getName());
        printCoffeeDetails();
        return this;
    }
    public String getName() {
        return name;
    }

    public int getMlOfWater() {
        return mlOfWater;
    }

    @Override
    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println(name + " water: " + mlOfWater + " ml");
    }
}
