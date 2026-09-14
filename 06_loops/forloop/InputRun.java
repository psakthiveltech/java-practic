package loops.forloop;
import java.util.Scanner;
public class InputRun {
    public static void main(String []args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the starting value");
     int startingValue = s.nextInt();
        System.out.println("Enter the ending value");
        int endValue = s.nextInt();
     for(int i = startingValue;i<=endValue;i++){
         System.out.println(i);
     }
    }
}
