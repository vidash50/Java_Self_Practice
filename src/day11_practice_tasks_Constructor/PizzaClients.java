package day11_practice_tasks_Constructor;

public class PizzaClients {
    public static void main(String[] args) {

    Pizza pizza1 = new Pizza( "small",2,2);
         System.out.println(pizza1.totalCost());

         Pizza pizza2 = new Pizza("medium", 2);
        System.out.println(pizza2.totalCost());

        Pizza pizza3 = new Pizza("large");
        System.out.println(pizza2.totalCost());



    }
}

/*
1. Create a custom class named Pizza with the following specifications:

    Attributes:
		   size
		   numberOfCheeseTopping
		   numberOfPepperoniTopping

	Actions:
		calcCost(): returns the totalCost of the pizza
		toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

   Pizza cost is determined by:
   		Small: $10 + $2 per topping
   		Medium: $12 + $2 per topping
   		Large: $14 + $2 per topping

    Create another class named PizzaClients, create multiple pizza objects, and test each function of the pizza object.
 */
