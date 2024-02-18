package day11_practice_tasks_Constructor;

public class CarpetClients {
    public static void main(String[] args) {

        Carpet carpet1 = new Carpet(10,20,15.5, true);
        System.out.println("carpet1 = " + carpet1.calCost());

        Carpet carpet2 = new Carpet(50,30,20,false);
        System.out.println("carpet2 = " + carpet2.calCost());


    }
}
/*

2. Create a custom class named Carpet with the following specifications:

    Attributes:
   			width
   			length
   			unitPrice
   			isPersian (boolean)

    Actions:
		calcCost(): calculate the total cost of the carpet and return it as a double.
   		toString(): display all the info of the carpet, including the total cost of the carpet as calculated by calcCost()

   Price calculation formula:
   		Total price of carpet = (width * length) * unitPrice
   		If the carpet is Persian, add $200 to the totalPrice

    Create another class named CarpetClients, create multiple carpet objects, and test each function of the carpet object.
 */