package Day19_ForLoop;

public class LoopPractice {
    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("==================================================================");
        for (int i = 1000; i <=2000; i++) {
            System.out.print(i+" ");

        }
        System.out.println("=========================================================================");
        for (int i = 1; i <=100 ; i += 2) {
            System.out.print(i+" ");
        }
        System.out.println("===================================================================");
        for (int i = 0; i <=100 ; i+= 2) {
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("====================================================================");

        for (int i = 1; i <=500 ; i++) {

            System.out.println("Push up" +i);
        }




    }
}
