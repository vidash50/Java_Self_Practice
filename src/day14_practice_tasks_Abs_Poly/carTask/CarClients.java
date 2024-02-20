package day14_practice_tasks_Abs_Poly.carTask;

public class CarClients {

    public static void main(String[] args) {

       BMW bmw = new BMW("B2023",2023, 150_000.00,"Blue");
       bmw.drive();
        System.out.println(bmw);
        Honda honda = new Honda("Q6", 2018, 37000, "Red");
        System.out.println(honda);

        Mercedes mercedes = new Mercedes("S550",2023,90_000.00,"Black");
        System.out.println(mercedes);

        Nio nio = new Nio("AC378", 2020, 120_000.00,"Orange");
        nio.stop();
        System.out.println(nio);



    }
}
