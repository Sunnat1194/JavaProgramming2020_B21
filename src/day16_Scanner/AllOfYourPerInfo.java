package day16_Scanner;
import java.util.Scanner;
public class AllOfYourPerInfo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int points =0;

        System.out.println("How many people do you live with");
        byte liveWithNumber = input.nextByte();

        if (liveWithNumber > 0 && liveWithNumber <=12){
            if(liveWithNumber <=2){
                points++;
            }else if (liveWithNumber > 7){
                points +=2;
            }else{
                points +=3;
            }
        }else{
            System.out.println("Not a valid number of people");
        }

    }
}
