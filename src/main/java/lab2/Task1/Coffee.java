// Coffee.java
package lab2.Task1;


public class Coffee {
    protected final Intensity coffeeIntensity;
    protected final String name = "Coffee";

    public Coffee(Intensity intensity) {
        this.coffeeIntensity = intensity;
    }

    public Intensity getIntensity() {
        return coffeeIntensity;
    }

    public String getName() {
        return name;
    }

    public void printCoffeeDetails() {
        System.out.println("Coffee Name: " + name);
        System.out.println("Intensity: " + coffeeIntensity);
    }
}
