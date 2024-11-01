// Americano.java
package lab2.Task2;

import lab2.Task1.Intensity;

public class Americano extends Coffee {
    private final int mlOfWater;

    public Americano(Intensity intensity, int mlOfWater) {
        super(intensity);
        this.mlOfWater = mlOfWater;
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
