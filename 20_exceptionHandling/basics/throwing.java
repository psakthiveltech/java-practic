package exceptionHandling.basics;

import java.util.Scanner;

public class throwing {

    public static void throwing(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter your age below : ");
        int userage = sc.nextInt();
        try {
            if (userage < 18) {
                System.out.println("In order to get licence you have to atleast greater than 18 but you not ");
                throw new ArithmeticException("this age is not allowed");
            }
            else{
                System.out.println("you are eligible to apply for an licence");
            }
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("i always there so dont worry");
        }
        System.out.println("end");


    }

    public static void main(String[]ath){
        throwing();
    }

}
