package loops.forloop.patterns;

import java.util.Scanner;

public class NumberPattern4 {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        Integer sj = 10;
        int n = s.nextInt();
        int num=0;
        for (int i = 1 ;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for (int i = 1 ;i<=n;i++){
            for(int j=1;j<=i;j++){
                num++;
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
