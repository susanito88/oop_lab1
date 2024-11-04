package lab2.Task4;

import lab2.Task1.Intensity;
import lab2.Task1.SyrupType;
import lab2.Task2.Cappuccino;

public class SyrupCappuccino extends Cappuccino {
    private final SyrupType syrup;
    protected final String name = "Syrup Cappuccino";

    public SyrupCappuccino(Intensity intensity, int mlOfMilk, SyrupType syrup) {
        super(intensity, mlOfMilk);
        this.syrup = syrup;
    }

    public SyrupCappuccino makeSyrupCappuccino() {
        System.out.println("Making " + getName());
        printCoffeeDetails();
        return this;
    }

    public SyrupType getSyrup() {
        return syrup;
    }
    public String getName() {
        return name;
    }

    @Override
    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println(name + " syrup: " + syrup);
    }
}
