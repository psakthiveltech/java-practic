package exceptionHandling;

public class howExcepworks {

    public static void howorks(){
        try{
            int j=10/0;
        }
        catch(RuntimeException e){
            System.out.println(e.getMessage());
        }

        catch(Exception e){
            System.out.println(e.getMessage()+"General excep");
        }
//        catch(ArithmeticException e){
//            System.out.println(e.getMessage() + " this is arithmetic execp");
//        }
        System.out.println("out side");
    }
    public static void main(String[]args){
        howorks();
    }

}
