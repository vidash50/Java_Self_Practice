package day14_practice_tasks_Abs_Poly.deviceTask;

public class Samsung extends Phone implements Downloadable, AndroidApps{


    public Samsung(String brand, String model, String color, String size, double price) {
        super(brand, model, color, size, price);
    }

    @Override
    public void downloadApp() {

        System.out.println("phone is downloading app");
    }
}
/*
- 'Samsung':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.
 */