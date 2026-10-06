package exceptionHandling.basics;

import java.util.Scanner;

public class ThrowException {
    public static void main (String[] args){
        try{
            Scanner s = new Scanner(System.in);
            System.out.println("Enter u r age");
            int age = s.nextInt();
            s.close();
            if(age<1){
                throw new Exception( "the age should be greater than one not less than one");
            }
        }
        catch(Exception e){
            System.out.println("Error : " + e);

        }
        finally{
            System.out.println("i'm here");
        }
    }
}