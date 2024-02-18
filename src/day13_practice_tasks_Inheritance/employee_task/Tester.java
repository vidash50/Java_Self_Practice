package day13_practice_tasks_Inheritance.employee_task;

public class Tester extends Employee{

    public Tester(String name, int age, String gender, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, age, gender, employeeId, jobTitle, salary, companyName);
    }

    public String work(){
        return getJobTitle()+ " "+ getName()+ " is testing";
    }
}
/*
2. Create the following subclasses of Employee:
   2.1 Tester:
       - work(): Displays "[jobTitle] [name] is testing".
 */