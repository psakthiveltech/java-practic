package loops.forloop.patterns;

import java.util.Scanner;

public class NumberPattern3 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int num =0;
        for (int i = 1 ;i<=n;i++){
            num=i;
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
