package day11_practice_tasks_Constructor;

public class CydeoStudentClients {
    public static void main(String[] args) {

        CydeoStudent cydeoStudent1 = new CydeoStudent("James", 22, 'A',
                "US33","B23d","B14");

        cydeoStudent1.attendClass();
        cydeoStudent1.study();
        cydeoStudent1.printSchoolName();

        System.out.println("cydeoStudent1 = " + cydeoStudent1);

        System.out.println("-----------------");

        System.out.println("cydeoStudent1 = " + cydeoStudent1 + "\n"+cydeoStudent1.study());

        System.out.println("cydeoStudent1 = " + cydeoStudent1+ "\n" + cydeoStudent1.attendClass());

        System.out.println("cydeoStudent1 = " + cydeoStudent1+ "\n" +cydeoStudent1.printProgLanguage());

        System.out.println("cydeoStudent1 = " + cydeoStudent1+ "\n" +cydeoStudent1.printSchoolName());

        System.out.println("cydeoStudent1 = " + cydeoStudent1+ "\n"
                +cydeoStudent1.study()+"\t"+cydeoStudent1.attendClass()+"\t"+
                cydeoStudent1.printProgLanguage()+"\t"+ cydeoStudent1.printSchoolName());

    }
}
/*
4. Create a custom class named CydeoStudent with the following specifications:

	Attributes:
			name
			age
			id
			grade
			batchNumber
			groupNumber
			schoolName (static)
			programmingLanguage (static)

	Constructors:
			Add a constructor that can set all the fields

	Actions:
		study(): displays the name of the Cydeo student on the console with the concatenated message "is studying."
		attendClass(): displays the name of the Cydeo student on the console with the concatenated message "is attending the live class."
		printSchoolName(): displays the school name
		printProgLanguage(): displays the name of the programming language
		toString(): returns a string representation of the CydeoStudent object.


	Create another class named CydeoStudentClients, create multiple CydeoStudent objects, and test each function of the CydeoStudent object.

 */
