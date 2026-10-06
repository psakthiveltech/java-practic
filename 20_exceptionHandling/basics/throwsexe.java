package exceptionHandling.basics;

public class throwsexe {

    public static void causeerror() throws ArithmeticException{
        int i=10/0;
        System.out.println(i+"not run");
    }
    public static void main(String[]args){
        try{
            causeerror();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
