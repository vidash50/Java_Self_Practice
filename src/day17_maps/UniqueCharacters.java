package day17_maps;

import java.util.*;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aabcccdeeeef";

        Map<String, Integer> uniqueCharMap = new LinkedHashMap<>();

        for (String each: str.split("")) {
            if (Collections.frequency(Arrays.asList(str.split("")), each)  ==1){
                uniqueCharMap.put(each, 1);
            }

        }

        System.out.println(uniqueCharMap);





    }
}
/*
5. Create a class named UniqueCharacters and write a program that returns the unique characters from a given
string as a map, with each character's frequency as the value. This should be done without using nested loops.

         Example:
               string = "aabcccdeeeef"

         Output:
               {b=1, d=1, f=1}
 */