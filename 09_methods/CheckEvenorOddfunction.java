package methods;
import java.util.Scanner;
public class CheckEvenorOddfunction {
    static{
        System.out.println("Enter the starting value");
    }

    public void checkEvenorOdd(long num){
        if(num%2==0){
            System.out.println("EVEN Value " + num);
        }else{
            System.out.println("ODD Value " + num);
        }
    }
    public static void main(String [] args){
        CheckEvenorOddfunction eo = new CheckEvenorOddfunction();
        Scanner s = new Scanner(System.in);
        long num=s.nextLong();
        eo.checkEvenorOdd(num);

    }
}
