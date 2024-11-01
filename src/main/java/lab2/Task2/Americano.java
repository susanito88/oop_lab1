// Americano.java
package lab2.Task2;

public class Americano extends Coffee {
    private final int mlOfWater;

    public Americano(Intensity intensity, int mlOfWater) {
        super(intensity);
        this.mlOfWater = mlOfWater;
    }

    public int getMlOfWater() {
        return mlOfWater;
    }

    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println("Water (ml): " + mlOfWater);
    }
}
