package exceptionHandling.basics;

public class IndexOutOfBounds {
    public static void main(String[] args){
        int []arr={1,2,3,4,5,6,7,8,9};
        try{
            System.out.println(arr[9]);
        }
        catch(Exception e){
            System.out.println(e+" Give correct instruction");
        }
        System.out.println("The Exception Handled");
    }
}
