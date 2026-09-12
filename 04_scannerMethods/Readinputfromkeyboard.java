package scannerMethods;

import java.util.Scanner;

public class Readinputfromkeyboard {

    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);


        System.out.println("enter u r number " );
        int a = value.nextInt();
        System.out.println("enter u r second number ");
        int b = value.nextInt();
        System.out.println("Total value "+(a+b));

    }
}
