package exceptionHandling.basics;

import java.util.Scanner;

public class throwing3 {
    public static void throwing(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name length  must be greater than 8 ");
        String name = sc.nextLine();
        try{
            if(name.length()<8){
                throw new ArrayIndexOutOfBoundsException("character length must be greater than 8 ");
            }
            else{
                System.out.println("login succesfull");
            }

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("i always run");
        }
        System.out.println("end ");
    }
    public static void main(String[]args){
        throwing();
    }
}
