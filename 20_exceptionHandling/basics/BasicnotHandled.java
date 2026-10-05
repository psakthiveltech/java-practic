package exceptionHandling.basics;

import java.util.Scanner;

public class BasicnotHandled {
   static Scanner sc = new Scanner(System.in);
    public static void notHandled(){
        System.out.println("Started");
        int inputs = sc.nextInt();
            int val = 10/inputs;
        System.out.println("-----------");
        System.out.println("after error...");
    }
    public static void main(String[]args){
        notHandled();
    }
}
