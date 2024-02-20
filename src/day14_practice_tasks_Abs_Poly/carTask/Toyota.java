package day14_practice_tasks_Abs_Poly.carTask;

public class Toyota extends Car{
    public Toyota(String model, int year, double price, String color) {
        super("Toyota", model, year, price, color);
    }

    @Override
    public void drive() {
        System.out.println("Driving " + getMake() + " " + getModel() + " on the road");
    }

    @Override
    public void start() {
        System.out.println("Twist the key to ignition to start " + getMake() + " " + getModel());

    }
}
