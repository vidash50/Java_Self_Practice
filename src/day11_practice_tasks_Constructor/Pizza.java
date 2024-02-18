package day11_practice_tasks_Constructor;

public class Pizza {

    public String size;
    public double numberOfCheeseTopping;
    public double numberOfPepperoniTopping;


    public double totalCost() {

        double price = 0;
            if (size.equalsIgnoreCase("small")) {
                price = 10 * numberOfPepperoniTopping + numberOfCheeseTopping;
            } else if (size.equalsIgnoreCase("medium")){
                price = 12 * numberOfCheeseTopping;
            }else if (size.equalsIgnoreCase("large")){
                price = 14 * numberOfPepperoniTopping + numberOfCheeseTopping;
            }else {
                price = 0;
            }

        return price;
    }

    public Pizza(String size) {
        this.size = size;
    }

    public Pizza(String size, double numberOfCheeseTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public Pizza(String size, double numberOfCheeseTopping, double numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                '}';
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


