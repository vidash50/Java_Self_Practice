package day07_practice_tasks;

import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of cents: ");
        int cents = scanner.nextInt();
        int dollars = cents /100;
        cents -= dollars * 100;


        System.out.println(dollars + " dollars and " + cents + " cents");// 2 dollars and 25 cents


    }
}
/*
8. Create a class named CentsToDollars and write a program that asks the user to enter the number of cents and
convert the given cents to dollars. Include any remainder in the result.

        Example:
             Enter the cents:
             Input: 225

        Output:
             225 cents is equal to 2 dollars and 25 cents
 */
