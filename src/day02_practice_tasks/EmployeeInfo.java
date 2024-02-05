package day02_practice_tasks;

public class EmployeeInfo {
    public static void main(String[] args) {
        String employeeName;
        int age;
        char gender;
        String companyName;
        String jobTitle;
        double yearsOfExperience;
        int salary;
        boolean isFullTime;
        boolean isMarried;
        String employeeId;


        employeeName = "Shay";
        age = 24;
        gender = 'F';
        companyName = "Apple Inc";
        jobTitle = "SDET";
        yearsOfExperience = 2.5;
        salary = 120_000;
        isFullTime = true;
        isMarried = false;
        employeeId = "B101";

        System.out.println("Employee name: "+ employeeName);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Job title: "+jobTitle);
        System.out.println("Company name: "+companyName);
        System.out.println("Full time: "+isFullTime);
        System.out.println("Years of work experience: "+yearsOfExperience+" years");
        System.out.println("Salary: $"+salary+".0");
        System.out.println("Married: "+isMarried);

    }
}
