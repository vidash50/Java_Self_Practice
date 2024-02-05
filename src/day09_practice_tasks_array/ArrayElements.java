package day09_practice_tasks_array;

public class ArrayElements {

    public static void main(String[] args) {

        int[] numbers = new int[101];

        for (int i = 1; i < numbers.length; i++) {

            numbers[i] = i;
            System.out.println(i);

        }

        System.out.println("---------------------------------------");

        // Displaying array elements
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("---------------------------------------");

        // Displaying array elements in reverse order
        System.out.println("Array elements in reversed order:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("---------------------------------------");

        // Displaying elements evenly divisible by 5
        System.out.println("Elements evenly divisible by 5:");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 5 == 0) {
                System.out.print(numbers[i] + " ");
            }
        }
        System.out.println();

    }
}

/*
1. Create a class named ArrayElements and write a program with the following specifications:
   1.1 Create an array of integers with a length of 100.
   1.2 Assign values from 1 to 100 to the indexes of the array.
   1.3 Display the array elements in a single line separated by spaces.
   1.4 Display the array elements in a single line in reversed order, separated by spaces.
   1.5 Display all evenly divisible elements by 5 in a single line separated by spaces.
 */