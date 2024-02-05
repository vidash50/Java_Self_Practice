package day08_practice_tasks_String;

public class EmailTask2 {
    public static void main(String[] args) {

        String email = "craig_federighi@apple.com";

        String firstName = email.substring(0, email.indexOf("_"));

        String lastName = email.substring(email.indexOf("_")+ 1, email.indexOf("@"));

        String domain = email.substring(email.indexOf("@")+ 1, email.lastIndexOf("."));

        System.out.println(firstName +"\n" + lastName+ "\n"+domain);

    }
}
