package day14_Switch_Recap;

public class Ternary {
    public static void main(String[] args) {

        int num = 100;


        String result1 = (num % 2 != 0) ? " Odd number" : " Even number";
        System.out.println(result1);

        String result2 = (num > 0) ? " Positive" : (num < 0) ? "Negative" : "Zero";
        System.out.println(result2);

        int n = 4;
        String day = (n == 1) ? "Monday" : (n == 2) ? "Tuesday" : (n == 3) ? "Wednesday" :
                (n == 4) ? "Thursday" : (num == 5) ? "Friday" : (n == 6) ? ("Saturday") : "Sunday";
        System.out.println(day);

    
    }
}
