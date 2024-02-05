package day02_practice_tasks;

public class StudentInfo {
    public static void main(String[] args) {
        String studentName;
        int age;
        String gender;
        String schoolName;
        String studentId;
        String gradeLevel;
        double gpa;

        studentName = "Josh Steven";
        age = 22;
        gender = "Male";
        gpa = 2.8;
        schoolName = "MIT";
        gradeLevel = "Undergraduate";
        studentId = "A125";

        System.out.println("The student's name is "+studentName);
        System.out.println("Gender is "+ gender);
        System.out.println("Age is "+age+" years old");
        System.out.println("The school's name is "+ schoolName);
        System.out.println("Grade level is "+gradeLevel);
        System.out.println("Josh Steven's GPA is "+gpa);
        System.out.println("The student ID is "+ studentId);
    }
}
