package loops.forloop.patterns;

import java.util.Scanner;

public class InversePattern {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Tell The Number : ");
        int n = s.nextInt();
        for(int i =1; i<=n;i++){
            for(int j = 1 ;j<=(n+1)-i;j++){
                System.out.print("*");
            }
            System.out.println(" ");

        }
    }

}
