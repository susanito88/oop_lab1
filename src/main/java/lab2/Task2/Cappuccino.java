package lab2.Task2;


import lab2.Task1.Intensity;

public class Cappuccino extends Coffee {
    private final int mlOfMilk;

    public Cappuccino(Intensity intensity, int mlOfMilk) {
        super(intensity);
        this.mlOfMilk = mlOfMilk;
    }

    public int getMlOfMilk() {
        return mlOfMilk;
    }

    @Override
    public void printCoffeeDetails(){
        super.printCoffeeDetails();
        System.out.println(name + " milk: " + mlOfMilk + " ml ");
    }
}
