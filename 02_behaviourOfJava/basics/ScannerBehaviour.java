package behaviourOfJava.basics;

import java.util.Scanner;

public class ScannerBehaviour {
   public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       int val = s.nextInt();
       float val2 = s.nextFloat();
       s.nextLine();
       String val3= s.nextLine();
       System.out.println(val+""+val2+""+"i guess this will not print..."+val3+"this will get in next line bcs it was a /n");

    }
}
