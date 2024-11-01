package lab2.Task3;


import lab2.Task1.Intensity;
import lab2.Task1.SyrupType;


public class Main {
    public static void main(String[] args) {
        Americano americano = new Americano(Intensity.NORMAL, 150);
        americano.makeAmericano();

        System.out.println();

        Cappuccino cappuccino = new Cappuccino(Intensity.NORMAL, 150);
        cappuccino.makeCappuccino();

        System.out.println();

        SyrupCappuccino syrupCappuccino = new SyrupCappuccino(Intensity.STRONG,100, SyrupType.POPCORN);
        syrupCappuccino.makeSyrupCappuccino();

        System.out.println();

        PumpkinSpiceLatte pumpkinSpiceLatte = new PumpkinSpiceLatte(Intensity.STRONG, 100, 50);
        pumpkinSpiceLatte.makePumpkinSpiceLatte();
    }
}