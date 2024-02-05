package day07_practice_tasks;

public class EmployeeClients {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Muthar";
        employee1.age = 19;
        employee1.gender = 'M';
        employee1.jobTitle = "SDET";
        employee1.salary = 120000.00;

        employee1.work();
        System.out.println(employee1);

    }
}
