package day13_practice_tasks_Inheritance.employee_task;

public class Developer extends Employee{

public String programmingLanguage;
    public Developer(String name, int age, String gender, String employeeId, String jobTitle, double salary, String companyName, String programmingLanguage) {
        super(name, age, gender, employeeId, jobTitle, salary, companyName);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        if (programmingLanguage == null || programmingLanguage.trim().isEmpty()) {
            throw new IllegalArgumentException("Programming language cannot be null, empty, or blank.");
        }
        this.programmingLanguage = programmingLanguage;
    }

    public String work(){
        return getJobTitle() + " "+ getName() + " is coding in "+ programmingLanguage;
    }
}
/*
2.2 Developer:
       - Extra Variable:
           - programmingLanguage: String
       - work(): Displays "[jobTitle] [name] is coding in [programmingLanguage]".

 */