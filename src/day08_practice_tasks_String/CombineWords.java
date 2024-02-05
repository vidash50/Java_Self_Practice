package day08_practice_tasks_String;

import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter first word");
        String word1 = scanner.next();

        System.out.println("enter second word");
        String word2 = scanner.next();

        //System.out.println(word1.concat(word2));

        String answer = "";

        if (word1.charAt(word1.length()-1)== word2.charAt(0)){
            answer = word1+word2.substring(1);

        }else {
            answer = word1+word2;
        }

        System.out.println(answer);





    }
}
