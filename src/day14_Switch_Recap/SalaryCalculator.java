package day14_Switch_Recap;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 100;
        int weeklyHour = 40;
        int numberOfWeeks = 52;

        int salary = 0;
        if (hourlyRate > 0){
            if (weeklyHour > 1 && weeklyHour <= 65){
                if(numberOfWeeks > 1 && numberOfWeeks <= 52){
                    salary= hourlyRate * weeklyHour * numberOfWeeks;
                }else{
                    System.out.println("number of weeks cannot be less than 1 or greater than 52");
                }
            }else{
                System.out.println("Weekly Hours cannot be less then 1 or greater than 65");
            }
        }else{
            System.out.println("Hourly Rate cannot be Negative or 0");
        }
        System.out.println(" Your salary is:" + salary);



    }
}
