package lab2.Task4;

import lab2.Task1.Intensity;
import lab2.Task1.SyrupType;
import java.util.List;



public class Barista {

    public void makeCoffee(List<String> coffeeOrders) {
        for (String order : coffeeOrders) {
            switch (order) {
                case "Cappuccino":
                    System.out.println("\n");
                    makeCappuccino(Intensity.NORMAL, 150);
                    break;
                case "Americano":
                    System.out.println("");
                    makeAmericano(Intensity.STRONG, 150);
                    break;
                case "Pumpkin Spice Latte":
                    System.out.println("\n");
                    makePumpkinSpiceLatte(Intensity.LIGHT, 150, 50);
                    break;
                case "Syrup Cappuccino":
                    System.out.println("\n");
                    makeSyrupCappuccino(Intensity.STRONG, 100, SyrupType.POPCORN);
                    break;
            }
        }
    }

    private void makeCappuccino(Intensity intensity, int mlOfMilk) {
        Cappuccino cappuccino = new Cappuccino(intensity, mlOfMilk);
        cappuccino.makeCappuccino();
    }

    private void makeAmericano(Intensity intensity, int mlOfMilk) {
        Americano americano = new Americano(intensity, mlOfMilk);
        americano.makeAmericano();
    }

    private void makePumpkinSpiceLatte(Intensity intensity, int mlOfMilk, int mgOfPumpkinSpice) {
        PumpkinSpiceLatte pumpkinSpiceLatte = new PumpkinSpiceLatte(intensity, mlOfMilk, mgOfPumpkinSpice);
        pumpkinSpiceLatte.makePumpkinSpiceLatte();
    }

    private void makeSyrupCappuccino(Intensity intensity, int mlOfMilk, SyrupType syrup) {
        SyrupCappuccino syrupCappuccino = new SyrupCappuccino(intensity, mlOfMilk, syrup);
        syrupCappuccino.makeSyrupCappuccino();
    }

}
