package day13_practice_tasks_Inheritance.phone_task;

public class IPhone extends Phone{


    public IPhone(String brand, String model, String size, double price, String color) {
        super(brand, model, size, price, color);
    }

    public String faceTime(String phoneNumber){
        return "facetiming with the number "+ phoneNumber;
    }
}
/*
1. Create a custom class named 'IPhone' with these specifications:
   Attributes:
       - brand: String
       - model: String
       - size: String
       - price: double
       - color: String

   Encapsulation:
       - All fields must be private with getters and setters.
       Conditions for Encapsulation:
           - The 'brand', 'model', and 'color' must not be null, empty, or blank.
           - The 'price' must be greater than zero.

   Constructor:
       - Add a constructor to initialize all fields.

   Actions:
       - call(phoneNumber): Display "calling the number [phoneNumber]".
       - text(phoneNumber): Display "texting to the number [phoneNumber]".
       - faceTime(phoneNumber): Display "facetiming with the number [phoneNumber]".
       - toString(): Prints the information of the IPhone object.

 */