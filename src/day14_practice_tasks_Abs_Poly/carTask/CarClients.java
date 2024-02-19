package day14_practice_tasks_Abs_Poly.carTask;

public class CarClients {

    public static void main(String[] args) {

       BMW bmw = new BMW("B2023",2023, 150_000.00,"Blue");
       bmw.drive();
        System.out.println(bmw);
        Honda honda = new Honda("Q6", 2018, 37000, "Red");
        System.out.println(honda);



    }
}
