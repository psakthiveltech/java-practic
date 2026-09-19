package array.tasks;
import java.util.Scanner;
public class Addinputvalues {
    public static void main(String [] args ){
        int adder =0;
        Scanner s = new Scanner(System.in);
        int[] in = new int[5];

        for(int i=0;i<=in.length-1;i++){
            System.out.println("Enter Number");
            in[i] = s.nextInt();
        }

        for(int i = 0;i<=in.length-1;i++){
            adder+=in[i];
        }
        System.out.println(adder);
        s.close();
    }
}
