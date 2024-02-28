package day16_practice_tasks_Collection;

import java.util.*;

import static java.util.Arrays.asList;

public class RemoveDuplicates {
    public static void main(String[] args) {


        Set<Integer> num = new TreeSet<>();
        num.addAll(Arrays.asList(20, 15, 10, 20, 30, 10, 20, 15, 0));
        System.out.println(num);


    }
}
/*
1. Create a class named RemoveDuplicates and write a program that takes a list of integers, removes any duplicate values, and returns the elements in sorted order.

         Example:
            {20, 15, 10, 20, 30, 10, 20, 15, 0}

         Output:
            {0, 10, 15, 20, 30}
 */
