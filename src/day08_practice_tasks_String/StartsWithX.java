package day08_practice_tasks_String;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {



        String word = "xcodex";
        if (word.charAt(0) == 'x'){

        word =  word.replaceFirst("x","a");
        }
        System.out.println(word);

    }
}
