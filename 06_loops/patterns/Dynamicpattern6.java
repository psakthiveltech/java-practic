package loops.forloop.patterns;

import java.util.Scanner;

public class Dynamicpattern6 {
    public static void main (String[] args){
        Scanner s  = new Scanner(System.in);
        System.out.println("How Many You Want");
        int n = s.nextInt();

        for(int i =1; i<n*2;i++){
            int con1 = i ;
            int con2 = n-i;
            if(i>n){
                con1=(2*n)-i;
                con2=i-n;
            }
            for(int j=1;j<=con1;j++){
                System.out.print("*");
            }
            for(int k = 1;k<=con2;k++){
                System.out.print(" ");
            }
            for (int l = 1; l <=con1;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        s.close();
    }
}