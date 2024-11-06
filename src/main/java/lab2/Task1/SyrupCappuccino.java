package lab2.Task1;

public class SyrupCappuccino extends lab2.Task2.Cappuccino {
    private final SyrupType syrup;

    public SyrupCappuccino(Intensity intensity, int mlOfMilk, SyrupType syrup) {
        super(intensity, mlOfMilk);
        this.syrup = syrup;
    }

    public SyrupType getSyrup() {
        return syrup;
    }


}
