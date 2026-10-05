package exceptionHandling.basics;

import java.util.Scanner;

public class arthimeticException {
    Scanner s = new Scanner(System.in);
    int i = 10;

    int input = s.nextInt();
    public  void testing(){

        try{
            int val=i/input;
            System.out.println(val);
        }catch (Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("I am(u) doom(u) ");
        }
    }
    public static void main(String[]args){
        arthimeticException ab = new arthimeticException();
        ab.testing();
    }
}
