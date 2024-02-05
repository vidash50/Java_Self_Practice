package day10_practice_tasks_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CombineTwoArrays {
    public static void main(String[] args) {

        String[] arr1  = {"A", "B", "C"};
        String[] arr2 = {"D", "E", "F", "G"};

        String[] results = new String[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {// copy firsts elements into the results array
            results[i] = arr1[i];

        }
        for (int i = 0; i < arr2.length; i++) {
            results[arr1.length + i] = arr2[i];

        }

        System.out.println(Arrays.toString(results));// [A, B, C, D, E, F, G]

        System.out.println("-----------");

//
//        String[] arr1 = {"A", "B", "C"};
//        String[] arr2 = {"D", "E", "F", "G"};
//
//        ArrayList<String> list = new ArrayList<>();
//
//        for (String each : arr1) {
//            list.add(each);
//        }
//
//        for (String each : arr2) {
//            list.add(each);
//        }
//
//        System.out.println(list);
















    }
}
/*
4. Create a class called CombineTwoArrays and write a program with the following specifications:
   4.1 Given two String arrays, combine them into one ArrayList.

                Example:
                    arr1 = {"A", "B", "C"};
                    arr2 = {"D", "E", "F", "G"};

                Output:
                    list ==> {"A", "B", "C", "D", "E", "F", "G"}
 notes: // 2nd loop ensures we do not overwrite the elements
 */