package day06_AritthmaticOperatarors;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

public class SalaryCalculator {
    public static void main(String[] args) {
        double salary = 150000;
        double stateTaxRate = 0.09;
        double federalTaxRte = 0.25;

        double stateTax =    salary * stateTaxRate;
        double federalTax = salary * federalTaxRte;
        double totalTax = stateTaxRate + federalTaxRte;

        double salaryAfterTax = salary - totalTax;

        System.out.println("Your salary is: $ " + salary);
        System.out.println("State Tax is: $ " + stateTax);
        System.out.println("Federal Tax is: $ " +federalTax);
        System.out.println("Total Tax is: $" + totalTax);
        System.out.println("Salary After Tax: $" +salaryAfterTax);








    }





}
/*
: SalaryCalculator
    variables: salary, stateTaxRate, federalTaxRate,  stateTax, federalTax, totalTax, salaryAfterTax
                100000    0.08         0.21
    output:
        Your salary is: YourSalary
        Your State Tax: YourStateTax
        Your federal Tax: federalTax
        your total tax: TotalTax
        your salary after tax: YourSalaryAfterTax
 */