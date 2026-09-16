package loops.forloop.patterns;

import java.util.Scanner;

public class DynamicPattern7 {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Give Any Number");

        int n = s.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i = 1 ;i<n-1;i++){
            for(int j= 1;j<=1;j++){
                System.out.print("*");
            }
            for(int k=1;k<=n-2;k++){
                System.out.print(" ");
            }
            for(int l=1;l<=1;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            System.out.print("*");
        }
        s.close();
    }
}
