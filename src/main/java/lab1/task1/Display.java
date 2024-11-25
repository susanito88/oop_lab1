package lab1.task1;

public class Display {
    private int width;
    private int height;
    private float ppi;
    private String model;

    public Display(int width, int height, float ppi, String model) {
        this.width = width;
        this.height = height;
        this.ppi = ppi;
        this.model = model;
    }

    public void compareSize(Display m) {
        int thisSize = this.width * this.height;
        int otherSize = m.width * m.height;
        if (thisSize > otherSize) {
            System.out.println(this.model + " is bigger than " + m.model);
        } else if (thisSize < otherSize) {
            System.out.println(this.model + " is smaller than " + m.model);
        } else {
            System.out.println(this.model + " is the same size as " + m.model);
        }
    }

    public void compareSharpness(Display m) {
        if (this.ppi > m.ppi) {
            System.out.println(this.model + " is sharper than " + m.model);
        } else if (this.ppi < m.ppi) {
            System.out.println(this.model + " is less sharp than " + m.model);
        } else {
            System.out.println(this.model + " has the same sharpness as " + m.model);
        }
    }

    public void compareWithMonitor(Display m) {
        compareSize(m);
        compareSharpness(m);
    }

    public String toString() {
        return model;
    }
}
