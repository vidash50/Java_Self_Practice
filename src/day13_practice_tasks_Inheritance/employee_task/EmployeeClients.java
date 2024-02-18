package day13_practice_tasks_Inheritance.employee_task;

public class EmployeeClients {
    public static void main(String[] args) {

        Employee employee1 = new Employee(
                "Vida", 25, "Female", "US2024","SDET",
                150_255.00, "Chase Bank"
        );
        System.out.println(employee1);

        Employee driver = new Driver("Zaba", 22, "Male","TY50",
                "senior driver",120_000.22, "Toyota");

        System.out.println(driver);

        Employee tester = new Tester("Anna", 20, "female","W508",
                "senior SDET",110_000.02, "Westchester Medical Hospital");
        System.out.println(tester);

       Developer developer = new Developer("Patrick",32,"Male","JET59","Programmer",199_625.50,"Delta Airline","java");
        System.out.println(developer);


        driver.work();
        employee1.work();
        System.out.println("tester " + tester.work());
        System.out.println("developer " + developer.work());


    }

}
/*
3. Create a class named "EmployeeClients":
   - Create multiple objects representing different employees.
   - Test the methods and attributes of each object.

 */