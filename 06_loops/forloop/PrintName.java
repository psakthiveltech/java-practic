package loops.forloop;

import java.util.Scanner;

public class PrintName {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:");
        int a = s.nextInt();

        System.out.println("Enter word:");
        String b = s.next();

        System.out.println("Enter sentence:");
        String c = s.nextLine();

        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        s.close();
    };
}
