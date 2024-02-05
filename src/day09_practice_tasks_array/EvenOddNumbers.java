package day09_practice_tasks_array;

public class EvenOddNumbers {
    public static void main(String[] args) {

        int [] numbers = {1, 2, 3, 4, 5, 6, 7};

        int odd = 0;
        int even = 0;

        for (int number : numbers) {

            if (number % 2 == 0) {
                odd ++;
            }else {
                even++;
            }
        }

        System.out.println(even);
        System.out.println(odd);


    }

//    public static int oddNumbers(int[] numbers) {
//        int odd = 1;
//        int even = 0;
//
//        for (int number : numbers) {
//
//            if (number % 2 == 0) {
//                odd ++;
//            }else {
//                even++;
//            }
//        }
//        return odd;
//    }
}

/*
3. Create a class named EvenOddNumbers and write a program that counts the even and odd numbers from an array of integers.

			Example:
				array = {1, 2, 3, 4, 5, 6, 7};

			Output:
				The array has 4 odd numbers and 3 even numb
 */
