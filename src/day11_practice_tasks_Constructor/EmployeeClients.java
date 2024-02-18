package day11_practice_tasks_Constructor;

public class EmployeeClients {
    public static void main(String[] args) {

        Employee employee1 = new Employee("James", "SDET");
        System.out.println(employee1.work());

        Employee employee2 = new Employee("James", "SDET", 19);
        System.out.println(employee2.work());

        Employee employee3 = new Employee("James", "SDET", 19,'F');
        System.out.println(employee3.work());

        Employee employee4 = new Employee("James", "SDET", 19, 'M',125000.25);
        System.out.println(employee4.work());





    }
}
/*

3. Create a custom class named Employee with the following specifications:

	Attributes:
			name (String)
			age (int)
			gender (char)
			jobTitle (String)
			salary (double)

    Constructors:
			Add multiple constructors to set different fields of the employee object.

    Actions:
		work(): prints the job title and name of the employee concatenated with " is working."
		toString(): returns a string representation of the employee object.

	Create another class named EmployeeClients, create multiple employee objects, and test each function of the employee object.

 */