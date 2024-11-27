package lab3.task3;
import lab3.task1.Queue;
import lab3.task2.Dineable;
import lab3.task2.Refuelable;
public class CarStation {
    private Dineable diningService;
    private Refuelable refuelingService;
    private Queue<Car> queue;
    public CarStation(Dineable diningService, Refuelable refuelingService, Queue<Car> queue) {
        this.diningService = diningService;
        this.refuelingService = refuelingService;
        this.queue = queue;
    }
    public void addCar(Car car) {
        queue.enqueue(car);
    }
    public void serveCars(){
        while (!queue.isEmpty()){
            Car car = queue.dequeue();
            if (car.isWantsDinner()){
                diningService.serveDinner(car.getType() + " Car");
            }
            refuelingService.refuel(car.getType() + " Car");
        }
    }
}