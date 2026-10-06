package exceptionHandling.basics;

public class throwpratice {
    public static void checkeligible(boolean say){
        try{
            if(!say){
                throw new IllegalAccessException("you are not eligible for this so go back .");
            }
            else{
                System.out.println("You are eligible . your good behaviour earned this");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("I always runed ");
        }
    }
    public static void main(String[]args){
        checkeligible(false);
    }
}
