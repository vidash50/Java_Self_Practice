package day08_practice_tasks_String;

import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
// NOT DONE
        Scanner scanner = new Scanner(System.in);


        System.out.println("Split or No Split");
        String split = scanner.next();

        System.out.println("Enter the number of people");
        int num = scanner.nextInt();

        System.out.println("Enter the check amount (number)");
        int checkAmount = scanner.nextInt();

        System.out.println("How was the service quality?");
        double service = scanner.nextDouble();

        if (service==0.25){
            System.out.println("Excellent");
        } else if (service == 0.2) {
            System.out.println("great");
        } else if (service == 0.15) {
            System.out.println("good");

        } else if (service == 0.1) {
            System.out.println("fair");
        }else if (service == 0.5){
            System.out.println("poor");
        }else {
            System.out.println("Invalid");
        }

        double tip = checkAmount * service;

        System.out.println(num);
        System.out.println(checkAmount);
        System.out.println(tip);

    }
}

/*

7. Create a class called TipCalculator and write a program for a tip calculator. There will be different service
quality benchmarks that will determine the tip given. There will also be the ability to calculate based on the
number of people in the party and whether there is a split of the bill.

        Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

      The program should ask the user to enter:
          - Split or No split (Yes or No),
          - Enter the number of people (number)
          - Enter the check amount (number)
          - Service Quality (String)

      And display the output in the following format:

            Example:
                  Split or No Split (Yes or No)?
                  Input: Yes
                  Enter the number of people:
                  Input: 4
                  Enter the check amount:
                  Input: 476
                  How was the service quality? (Excellent/Great/Good/Fair/Poor)
                  Input: Excellent

            Output:
                 Number of people entered: 4
                 Total to pay: 595.0
                 Total tip: 119.0
                 Total per person: 148.75
                 Tip per person: 29.75

 */
