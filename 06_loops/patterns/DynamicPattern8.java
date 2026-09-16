package loops.forloop.patterns;

import java.util.Scanner;

public class DynamicPattern8 {
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i = 1 ; i<=n*2; i++){
            int con1=i;
            int con2=(n-i)*2;
            if(i>n){
                con1 = (2 * n) - i;
                con2= (2*i)-(2*n);
            }
            for(int j=1;j<=con1;j++){
                if(i>n){
                    if(j==(2*n)-i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    if(j==i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }

            }
            for(int k = 1 ; k <= con2;k++){
                System.out.print(" ");
            }
            for(int l = 1 ; l<=con1;l++){
                   if(l==1){
                       System.out.print("*");
                   }
                   else{
                       System.out.print(" ");
                   }
            }
            System.out.println();
        }
    }
}
