package loops.forloop.patterns;

import java.util.Scanner;

public class NumberPattern6 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int number =0;
        for (int i = n ;i>=1;i--){
            number = i;
            for(int j=n;j>=i;j--){
                System.out.print(number);
                number++;
            }
            System.out.println();
        }
    }
}
