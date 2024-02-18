package day13_practice_tasks_Inheritance.employee_task;

public class Driver extends Employee{

    public Driver(String name, int age, String gender, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, age, gender, employeeId, jobTitle, salary, companyName);
    }

    public String work(){
        return getName() + " is driving";
    }
}
/*
2.4 Driver:
       - work(): Displays "[name] is driving".
 */