package loops.forloop.patterns;

import java.util.Scanner;

public class NumberPattern5 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int number =n;
        for (int i = 1 ;i<=n;i++){
            number = n;
            for(int j=1;j<=i;j++){
                System.out.print(number);
                number--;
            }
            System.out.println();
        }
    }
}