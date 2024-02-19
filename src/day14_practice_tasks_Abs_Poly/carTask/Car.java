package day14_practice_tasks_Abs_Poly.carTask;

public abstract class Car {

    private final String make;
    private final String model;

    private final int year;

    private double price;

    private String color;

    public Car(String make, String model, int year, double price, String color) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public String setMake(){
        if (make == null || make.trim().isEmpty()) {
            throw new IllegalArgumentException("Make cannot be null or empty.");
        }
        return make;
    }

    public String getModel() {
        return model;
    }
    public void setModel(){
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model cannot be null or empty.");
        }
    }

    public int getYear() {
        return year;
    }
    public void setYear(){
        if (year <= 1886){
            System.out.println("Year cannot be less or equal to 1886");
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price <=0){
            System.out.println("Price cannot be negative");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException("Color cannot be null or empty.");
        }
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public abstract void drive();
    public abstract void start();
    public final void stop(){
        System.out.println("Press the break to stop the car " + make + " " + model);
    }

}
/*

1. Create an Abstract Class Named 'Car':
    - Variables:
        - final make
        - final model
        - final year
        - price
        - color
    - Encapsulate all fields.
    - Constructor: Initializes all fields.
    - Conditions for setting fields:
        - make, model, color must not be null or empty.
        - year must not be less than 1886.
        - price must not be negative.
    - Abstract Methods:
        - start()
        - drive()
    - Non-Abstract Methods:
        - stop()
        - toString()
 */