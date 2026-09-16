package loops.forloop.patterns;

import java.util.Scanner;

public class DynamicPattern10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<=(n*2)-1;i++){

            int star = i;

            int gap = (2*n)-(2*i);
            if(i>n){
                star=(2*n)-i;
                gap = (2*i)-(2*n);
            }

            for(int j=1;j<=star;j++){
                System.out.print("*");
            }

            for(int k=1;k<=gap;k++){
                System.out.print(" ");

            }

            for(int m=1;m<=star;m++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
