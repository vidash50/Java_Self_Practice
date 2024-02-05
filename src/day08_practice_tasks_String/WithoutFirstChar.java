package day08_practice_tasks_String;

public class WithoutFirstChar {
    public static void main(String[] args) {

        String word = "apple";
        String word2 = "banana";

        String result = word.substring(1)+ word2.substring(1);

        System.out.println(result);
    }
}
