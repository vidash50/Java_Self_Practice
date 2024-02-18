package day11_practice_tasks_Constructor;

public class CydeoStudent {

    public String name;
    public  int age;

    public char grade;
    public String batchNumber;
    public String id;
    public String groupNumber;
    public static String schoolName = "Cydeo";
    public static String programmingLanguage = "Java";

    public CydeoStudent(String name, int age, char grade,
                        String batchNumber, String id, String groupNumber) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.id = id;
        this.groupNumber = groupNumber;

    }
    public String study(){
        return name + " is studying.";
    }

    public String attendClass(){
        return name + " is attending the live class.";
    }

    public String printSchoolName(){
        return schoolName;
    }

    public String printProgLanguage(){
        return programmingLanguage;
    }

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                ", batchNumber='" + batchNumber + '\'' +
                ", id='" + id + '\'' +
                ", groupNumber='" + groupNumber + '\'' +
                '}';
    }
}
/*
Actions:
		study(): displays the name of the Cydeo student on the console with the concatenated message "is studying."
		attendClass(): displays the name of the Cydeo student on the console with the concatenated message "is attending the live class."
		printSchoolName(): displays the school name
		printProgLanguage(): displays the name of the programming language
		toString(): returns a string representation of the CydeoStudent object.


	Create another class named CydeoStudentClients, create multiple CydeoStudent objects, and test each function of the CydeoStudent object.

 */