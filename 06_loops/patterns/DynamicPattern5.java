package loops.forloop.patterns;
import java.util.Scanner;
public class DynamicPattern5 {
    public static void main (String [] args)
    {
        Scanner ss = new Scanner(System.in);
        System.out.println("enter the value");
        int n = ss.nextInt();
        ss.close();
        for(int i =1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(n-i);k++){
                System.out.print(" ");
            }
            for(int l=1;l<=i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print("*");
            }
            for(int k=1;k<=(i+i);k++){
                System.out.print(" ");
            }
            for(int l=1;l<=(n-i);l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
