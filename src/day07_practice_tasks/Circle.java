package day07_practice_tasks;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //System.out.println("enter the radius of the Circle and calculate");
        System.out.println("Enter the radius: ");

        double radius = input.nextDouble();
        input.nextLine();

        double area = radius * radius*3.14;
        double perimeter = radius* 3.14* 2;
        System.out.println("The area of the Circle is "+area );
        System.out.println("The perimeter of the Circle "+perimeter);






    }
}

/*
6. Create a class named Circle and write a program that asks the user to enter the radius of the Circle and calculate
the area and perimeter of the Circle.

        Example:
             Enter the radius:
             Input: 5

        Output:
             The area of the Circle is 78.5
             The perimeter of the Circle is 31.4
 */
