package lab2.Task4;

import lab2.Task1.Intensity;
import lab2.Task2.Cappuccino;

public class PumpkinSpiceLatte extends Cappuccino {
    private final int mgOfPumpkinSpice;
    protected final String name = "Pumpkin Spice Latte";

    public PumpkinSpiceLatte(Intensity intensity, int mlOfMilk, int mgOfPumpkinSpice) {
        super(intensity, mlOfMilk);
        this.mgOfPumpkinSpice = mgOfPumpkinSpice;
    }

    public PumpkinSpiceLatte makePumpkinSpiceLatte() {
        System.out.println("Making " + getName());
        printCoffeeDetails();
        return this;
    }

    public int getMgOfPumpkinSpice() {
        return mgOfPumpkinSpice;
    }
    public String getName() {
        return name;
    }

    @Override
    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println(name + " pumpkin spice: " + mgOfPumpkinSpice + " mg");
    }
}
