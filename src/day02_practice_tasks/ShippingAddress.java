package day02_practice_tasks;

public class ShippingAddress {
    public static void main(String[] args) {
        String fullName;
        int buildingNumber;
        String streetName;
        String city;
        String state;
        long zipCode;

        fullName = "Aaron Kissinger";
        buildingNumber = 13621;
        streetName = "Legacy Circle";
        city = "Fairfax";
        state = "VA";
        zipCode = 22030;

        System.out.println("Your Shipping address is:");
        System.out.println("\t\t\t\t"+fullName);
        System.out.println("\t\t\t\t"+buildingNumber+" "+streetName);
        System.out.println("\t\t\t\t"+city+", "+state+" "+zipCode);
    }
}
