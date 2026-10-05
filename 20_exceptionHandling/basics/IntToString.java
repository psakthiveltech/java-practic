package exceptionHandling.basics;

public class IntToString {
    public static void main(String[] args){
        int a;
        try{
            a= Integer.parseInt("jkahsfkjh");
            System.out.println(a);
        }
        catch(Exception e){
            System.out.println("error"+e);
        }
    }
}