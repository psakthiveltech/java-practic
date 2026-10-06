package exceptionHandling.basics;

import java.util.Scanner;

public class throwing2 {
    public static void throwing(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number only odd");
        int val = sc.nextInt();
        try{
            if(val%2==0){
                throw new RuntimeException("your enter even");
            }else{
                System.out.println("correctly you did : "+val );
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
            System.out.println("close");
        }
        System.out.println("ending s");
    }
    public static void main(String[]age){
        throwing();
    }

}
