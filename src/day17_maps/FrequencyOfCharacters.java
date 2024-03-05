package day17_maps;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String string = "bbcccaaaaa";

        Map<String, Integer> freqMap = new LinkedHashMap<>();

        for (String each : string.split("")) {
            int frequency = Collections.frequency(Arrays.asList(string.split("")),each);
            freqMap.put(each, frequency);
        }

        System.out.println(freqMap);



    }
}
/*
4. Create a class named FrequencyOfCharacters and write a program that returns the frequency of each
character in a given string as a map, without using nested loops.
         Example:
               string = "bbcccaaaaa"

         Output:
               {b=2, c=3, a=5}
 */