package loops.forloop.patterns;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args){
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int binary=0;

        for(int i=1;i<=n;i++){
            if(binary==0){
                binary=1;
            }
            else{
                binary=0;
            }
            for(int j=1;j<=i;j++){
                System.out.print(binary);
            }
            System.out.println();

        }
    }

}
