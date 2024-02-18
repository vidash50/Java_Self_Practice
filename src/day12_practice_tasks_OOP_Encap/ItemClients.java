package day12_practice_tasks_OOP_Encap;

public class ItemClients {
    public static void main(String[] args) {

        Item item = new Item("cookie",2.1, 5);
        System.out.println(item.calcCost());

        Item item2 = new Item("nuts",25.1, 3);
        System.out.println("item2 is "+item2.calcCost());

        Item candy = new Item("bubble gum", 2,0);
        System.out.println("Candy is "+ candy.calcCost());

    }
}
