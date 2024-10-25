package lab1.task3;

import lab1.task1.Display;

public class Main3 {
    public static void main(String[] args) {
        Assistant assistant = new Assistant("John");

        Display display1 = new Display(1920, 1080, 401, "Dell UltraSharp");
        Display display2 = new Display(2560, 1440, 500, "Samsung Odyssey");
        Display display3 = new Display(3440, 1440, 300, "LG Ultrawide");

        assistant.assignDisplay(display1);
        assistant.assignDisplay(display2);
        assistant.assignDisplay(display3);

        assistant.assist();
        System.out.println();
        assistant.buyDisplay(display2);
        System.out.println();

        assistant.assist();
        System.out.println();
        assistant.buyDisplay(display3);
        System.out.println();

        assistant.assist();
        System.out.println();
        assistant.buyDisplay(display1);
    }
}
