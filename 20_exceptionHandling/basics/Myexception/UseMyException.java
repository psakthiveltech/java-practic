package exceptionHandling.basics.Myexception;

import java.util.Scanner;

public class UseMyException {
    public static void activatemyException(){
        System.out.println("the developer name is : 'psv'");
        Scanner sc = new Scanner(System.in);
        System.out.println("Which is the developer name ?");
        String devname ="psv";
        String name = sc.nextLine();
        try {
            if (!name.equals(devname)) {
                throw new FirstException("WRONG !. The psv is the dev name...");
            } else {
                System.out.println("Correct Answer");
            }
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
            System.out.println("super");
        }
        System.out.println("code end...");
    }
    public static void main(String[]args){
        activatemyException();
    }
}
