package exceptionHandling.basics;

import java.util.Scanner;

public class BasicHandled {
    static Scanner sc = new Scanner(System.in);
    static int num = 10;
    static int div = sc.nextInt();
    public static void handled(){
        try {
            System.out.println("Started 01");
            int result = num/div;
            System.out.println("when get error this not run it goes to catch ");
        }
        catch(ArithmeticException e){
            System.out.println("yeah ."+e.getMessage());
        }
        catch(Exception e){
            System.out.println("eheheheh ... error : "+e.getMessage());
//            System.out.println(e.getStackTrace());
        }
        System.out.println("END OF THIS PROGRAM 0- it will run only because of that try catch !");
    }
    public static void main(String[]atg){
        handled();
    }
}
