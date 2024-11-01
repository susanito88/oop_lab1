package lab2.Task2;


public class Cappuccino extends lab2.Task2.Coffee {
    private final int mlOfMilk;

    public Cappuccino(Intensity intensity, int mlOfMilk) {
        super(intensity);
        this.mlOfMilk = mlOfMilk;
    }

    public int getMlOfMilk() {
        return mlOfMilk;
    }

    public void printCoffeeDetails() {
        super.printCoffeeDetails();
        System.out.println("Milk (ml): " + mlOfMilk);
    }
}
