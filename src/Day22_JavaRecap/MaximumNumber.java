package Day22_JavaRecap;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int max = -999999999;

        for (int i = 1; i <=5 ; i++) {
            System.out.println("Enter a number:");
            int n = scan.nextInt();  
            
            if(n > max){
               max = n; 
            }
            
        }
        scan.close();
        System.out.println("max = " + max);
       
        
    }
}
