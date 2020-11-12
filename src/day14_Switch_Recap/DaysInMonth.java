package day14_Switch_Recap;

public class DaysInMonth {
    public static void main(String[] args) {
        int year = 2020;
        String month = "Jan";


        String result = "";

        switch (month){
            case "Jan":  result = "31 days";
                break;
            case  "Feb": result = (year%4 == 0) ? "29 days" : "28 days";
                break;
            case "Mar": result = "31 days";
                break;
            case "Apr": result = "30 days";
                break;
            case "May": result = "31 days";
                break;
            case "Jun": result = "30 days";
                break;
            case "Jul": result = "31 days";
                break;
            case "Aug":  result = "31 days";
                 break;
            case "Sep":   result= "30 days";
                 break;
            case "Oct": result = "31 days";
                 break;
            case "Nov": result = "30 days";
                 break;
            case "Dec": result ="31 day";

            default: result = "Invalid day";

        }

        System.out.println(result);





    }
}
