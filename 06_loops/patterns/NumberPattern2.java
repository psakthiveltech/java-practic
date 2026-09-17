package loops.forloop.patterns;

import java.util.Scanner;

public class NumberPattern2 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = n ;i>=1;i--){
            for(int j=1;j<=1+(n-i);j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}