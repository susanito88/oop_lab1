package lab2.Task3;


import lab2.Task1.Intensity;
import lab2.Task2.Coffee;

public class Cappuccino extends Coffee {
    private final int mlOfMilk;
    protected final String name = "Cappuccino";

    public Cappuccino(Intensity intensity, int mlOfMilk) {
        super(intensity);
        this.mlOfMilk = mlOfMilk;
    }

    public Cappuccino makeCappuccino() {
        System.out.println("Making " + getName());
        printCoffeeDetails();
        return this;
    }

    public int getMlOfMilk() {
        return mlOfMilk;
    }
    public String getName() {
        return name;
    }

    @Override
    public void printCoffeeDetails(){
        super.printCoffeeDetails();
        System.out.println(name + " milk: " + mlOfMilk + " ml ");
    }
}
