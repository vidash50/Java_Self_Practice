package day08_practice_tasks_String;

import java.util.Scanner;



public class FullName {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter first name");
        String firstName = scanner.next();

        System.out.println("enter second name");
        String secondName = scanner.next();

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();

        System.out.println(firstName+ " "+ secondName);
    }
}
/*
6. Write a program that asks the user to enter first and last names and then prints the full name in regular format
(first character in uppercase).

        Example:
              Input:
                  firstName = "cyDEo";
                  lastName = "SCHOOL";

              Output:
                   Cydeo School
 */