package day14_practice_tasks_Abs_Poly.deviceTask;

public class Iphone extends Phone implements Downloadable, AppleApps{

    public Iphone(String brand, String model, String color, String size, double price) {
        super(brand, model, color, size, price);
    }

    @Override
    public void downloadApp() {
        System.out.println("phone is downloading app");
    }
}
/*
 7. Create the Following Subclasses of Phone:
    - 'Iphone':
        - Extends Phone class.
        - Implements Downloadable & AppleApps interfaces.
 */