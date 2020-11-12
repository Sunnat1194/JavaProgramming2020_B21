package day15_Scanner;
import java.util.Scanner;
public class Scanner_Int {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number one: ");
        int numOne = scanner.nextInt();

        System.out.println("Enter number two: ");
        int numTwo = scanner.nextInt();

        System.out.println("Number One is : " +numOne);
        System.out.println("Number Two is : "+numTwo);
        System.out.println("Sum "+ (numOne + numTwo));

    }
}
