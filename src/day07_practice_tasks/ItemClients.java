package day07_practice_tasks;

public class ItemClients {
    public static void main(String[] args) {

        Item item1 = new Item();

        item1.itemName = "books";

        item1.quantity = 25;

        item1.unitPrice = 25.5;

        System.out.println("item1.calcCost() = " + item1.calcCost());

        System.out.println("============");

        Item item2 = new Item();

        item2.itemName = "shirts";

        item2.quantity = 55;

        item2.unitPrice = 5.5;

        System.out.println("item2.calcCost() = $" + item2.calcCost());


    }
}
