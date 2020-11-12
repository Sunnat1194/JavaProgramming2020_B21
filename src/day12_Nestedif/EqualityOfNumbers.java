package day12_Nestedif;

public class EqualityOfNumbers {
    public static void main(String[] args) {
       int n1 = 100;
       int n2 = 200;
       int n3 = 300;

       // for n1 & n2 are equal =    n1 == n2 && n1 !=n3;
        // for n2 & n3 are equal =   n2 == n3 && n2 !=n1;
       // for n1 & n3 are equal =    n1 == n3 && n1 !=2;
       //for all equal =             n1 == n2 && n2 == n3;



       String result = "";
        if ( n1 == n2 && n2 == n3){                       // becomes if not all of them are equal
            result = " all equal";
        }else if (n1 == n2 ){
            result = " n1&n2 are equal";
        }else if (n2 == n3){
            result = "n2&n3 are equal";
        }else if (n1 == n3 ){
            result ="n1&n3 are equal";
        }else{
            result = "non of them are equal";
        }

        System.out.println(result);

        String result2 = (n1 == n2 && n2 == n3) ? "all eqaul" : (n1 == 2) ? " n1&n2 are equal"
                : (n2 == 3) ? "n2&n3 are equal" : (n1 == n3) ? "n1&n3 are equal" : "non of them are equal";

        System.out.println(result2);





    }
}
