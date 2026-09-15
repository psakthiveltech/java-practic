package loops.forloop.patterns;

import java.util.Scanner;

public class DynamicPattern4 {
    public static void main (String [] args){
        Scanner ss = new Scanner(System.in);
        System.out.println("enter the value");
        int n = ss.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int k = 0; k<=n;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
