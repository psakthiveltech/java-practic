package array.tasks;
import java.util.Scanner;
public class Getcenternum {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Set the limit");
        int size = s.nextInt();
        int[] val = new int[size];
        int centerValue = val.length/2;
        for(int i = 0; i<=size-1;i++){
            System.out.println("Enter the value");
            val[i]=s.nextInt();
        }
        System.out.println("center value is : "+val[centerValue]);
        s.close();
      /*  for(int i : val){
            if(centerVal==i){
                System.out.println(" the mid value is : "+i);
            }*/

    }
}