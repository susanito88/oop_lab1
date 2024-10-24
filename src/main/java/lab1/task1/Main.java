package lab1.task1;

public class Main {
    public static void main(String[] args) {
        Display display1 = new Display(1920, 1080, 401.0f, "Display1");
        Display display2 = new Display(2560, 1440, 300.0f, "Display2");
        Display display3 = new Display(3840, 2160, 500.0f, "Display3");

        System.out.println("Comparing Display1 and Display2:");
        display1.compareWithMonitor(display2);

        System.out.println("\nComparing Display2 and Display3:");
        display2.compareWithMonitor(display3);

        System.out.println("\nComparing Display1 and Display3:");
        display1.compareWithMonitor(display3);
    }
}
