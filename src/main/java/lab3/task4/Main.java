package lab3.task4;

import lab3.task3.Car;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore();
        // Simulate cars arriving
        Car car1 = new Car(1, "ELECTRIC", "PEOPLE", false, 10);
        Car car2 = new Car(2, "GAS", "PEOPLE", true, 15);
        Car car3 = new Car(3, "GAS", "ROBOTS", true, 20);
        Car car4 = new Car(4, "ELECTRIC", "ROBOTS", true, 5);
        System.out.println("Processing cars...");
        semaphore.routeCar(car1);
        semaphore.routeCar(car2);
        semaphore.routeCar(car3);
        semaphore.routeCar(car4);
//        System.out.println("\nDisplaying queues:");
//        semaphore.displayAllQueues();
        System.out.println("\nServing all cars...");
        semaphore.serveAllCars();
        System.out.println("\nFinal Stats:");
        Map<String, Integer> stats = semaphore.getStats();
        stats.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}