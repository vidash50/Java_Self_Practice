package day13_practice_tasks_Inheritance.employee_task;

public class Teacher extends Employee{


    public Teacher(String name, int age, String gender, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, age, gender, employeeId, jobTitle, salary, companyName);
    }

    public String work(){
        return getName()+ " is teaching";
    }
}
/*

 2.3 Teacher:
       - work(): Displays "[name] is teaching".

 */