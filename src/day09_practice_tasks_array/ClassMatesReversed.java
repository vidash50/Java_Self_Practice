package day09_practice_tasks_array;

public class ClassMatesReversed {
    public static void main(String[] args) {

        String[] classmates = {"Vida Nana", "Brandon Zebar", "Vincent Ampong", "Asia Hammond","Mansa Musa", "Gina Georgia", "Anna Statis", "Joel Turkey", "Patrick Ansah", "Joshua Bernett"};
        for (int i = 0; i < classmates.length; i++) {
            String name = classmates[i];
        String  reversed = "";
            for (int j = name.length() - 1; j >= 0; j--) {
                reversed += name.charAt(j);
            }

            System.out.println(reversed);

        }


    }

}

/*

6. Create a class named ClassMatesReversed and write a program with the following specifications:
   6.1 Create an array of strings named classmates.
   6.2 Store full names of 10 classmates.
   6.3 Reverse each student's name and print them on separate lines.
 */