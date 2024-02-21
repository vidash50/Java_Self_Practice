package day14_practice_tasks_Abs_Poly.deviceTask;

public final class Google extends Phone implements  Downloadable, AndroidApps{


    public Google(String brand, String model, String color, String size, double price) {
        super(brand, model, color, size, price);
    }

    @Override
    public void downloadApp() {
        System.out.println("");


    }
}
/*
 'Google':
        - Extends Phone class.
        - Implements Downloadable & AndroidApps interfaces.

 */