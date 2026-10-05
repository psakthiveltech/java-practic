package exceptionHandling.exersice;

import java.util.Scanner;

public class InputMismatchAndArithmeticExeption {
    public static void main(String[] args){
        Scanner s =  new Scanner(System.in);
        try{
            int a = s.nextInt();
            int b = s.nextInt();
            int c = a/b;
            System.out.println(c);
        }catch(ArithmeticException e){
    System.out.println("The value is not divided by this num " + e);
        }
        catch(Exception e){
            System.out.println("The value u provide int but u typed other type " + e);
        }finally{
            System.out.println("It always executed" );
        }
        System.out.println("All line executed" );
    }
}
