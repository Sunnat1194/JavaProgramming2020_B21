package day_21_WhileLoop;
import java.util.Scanner;
public class StringReversePractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String word = scan.nextLine();

        String reversedWord = " ";

        int lastIndex = word.length()-1;
        for (int i = lastIndex; i >=0 ; i--) {
            System.out.print(word.charAt(i) );
                reversedWord +=word.charAt(i);
        }
        System.out.println(reversedWord);
    }
}
