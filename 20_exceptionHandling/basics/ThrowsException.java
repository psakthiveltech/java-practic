package exceptionHandling.basics;

public class ThrowsException {

    public static void throwstheexception()throws Exception
    {
        int s = 10/0;
        System.out.println(s);
    }
    public static void main(String[] args){
        ThrowsException t = new ThrowsException();
        try{
            ThrowsException.throwstheexception();
        }
        catch(Exception r){
            System.out.println(r);

        }
        System.out.println("all");

    }
}
