package exceptionHandling.basics;

import java.util.Scanner;

public class mytrywithresourse {
    public static void usetryres(){

        try(Scanner sc = new Scanner(System.in)){
            System.out.println("Entet value below : ");
            int val = sc.nextInt();
            System.out.println(10/val);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
        finally{
            System.out.println("i always run");
        }
        System.out.println("end");
    }
    public static void main(String[]args){
        usetryres();
    }
}
