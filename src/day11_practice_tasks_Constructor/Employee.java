package day11_practice_tasks_Constructor;

public class Employee {

    public String name, jobTitle ;
    public  int age;
    public char gender;
    public  double salary;

    public Employee(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, int age) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
    }

    public Employee(String name, String jobTitle, int age, char gender) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.gender = gender;
    }

    public Employee(String name, String jobTitle, int age, char gender, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }

    public String work(){
        return (jobTitle + " "+name +" "+age+" "+gender+" "+ salary+" "+" is working." );
        // job title and name of the employee concatenated with " is working."
        //System.out.println(jobTitle + " "+name +" "+" is working." );



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
