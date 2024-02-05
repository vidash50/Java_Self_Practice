package day03_practice_tasks;

public class SalaryCalculator {
    public static void main(String[] args) {

        double hourlyRate;
        int weeklyHours;
        double stateTaxRate;
        double federalTaxRate;

        int weeksInYear = 52;

        hourlyRate = 50;
        weeklyHours = 45;
        stateTaxRate = 6;  //(given as a percentage)
        federalTaxRate = 26; //(given as a percentage)

        double grossPay = hourlyRate*weeklyHours*weeksInYear;

        double federalTax = grossPay*(federalTaxRate/100);
        double stateTax = grossPay*(stateTaxRate/100);

        double totalTax = federalTax+stateTax;

        double netIncome = grossPay - totalTax;

        System.out.println("Gross pay is: " + "$"+grossPay);

        System.out.println("Federal tax is: "+ "$"+federalTax);

        System.out.println("State tax is: "+ "$"+stateTax);

        System.out.println("Total tax is: "+ "$"+totalTax);

        System.out.println("Net income is: "+ "$"+ netIncome);



    }
}
/*
4. Create a class named SalaryCalculator. Given the following variables:
				hourlyRate (double)
				weeklyHours (int)
				stateTaxRate (double)
				federalTaxRate (double)

	Use the given information above to calculate the following:
				salaryBeforeTax
				stateTax
				federalTax
				totalTax
				salaryAfterTax

	Display each of the above in the following format:

					Example:
						hourlyRate = $50
						weeklyHours = 45
						stateTaxRate = 6  (given as a percentage)
						federalTaxRate = 26 (given as a percentage)

					Output:
						Gross pay is: $117000.0
						Federal tax is: $30420.0
						State tax is: $7020.0
						Total tax is: $37440.0
						Net income is: $79560.0
 */
