package day13_practice_tasks_Inheritance.phone_task;

public class PhoneClients {
    public static void main(String[] args) {

        IPhone iphone = new IPhone("Samsung", " ", "small", 1320.20, "Red");
        System.out.println(iphone);
        iphone.call(454589650);
        iphone.text(454589650);

        Nokia nokia = new Nokia("Nokia ", "G11 plus", "6.2 inches", 129.99,"Black");
        System.out.println(nokia);
        nokia.call(23396512);
        nokia.text(23396512);

        Samsung samsung = new Samsung("Samsung","Galaxy S24 ultra", "9.5 inches", 1499.32,"Gold");
        System.out.println(samsung);
        samsung.call(1236547890);
        samsung.text(1236547890);


    }

}
/*
4. Create a class named "PhoneClients":
   - Create multiple objects representing different phones.
   - Test the methods and variables of each object.

 */