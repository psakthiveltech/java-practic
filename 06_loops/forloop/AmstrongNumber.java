package loops.forloop;

import java.util.Scanner;

public class AmstrongNumber {
   public static void main() {
        Scanner s = new Scanner(System.in);
       System.out.println("enter the number : ");
        int a = s.nextInt();
        int b =a;
        String lens = a+"";
        int result = 0;
        while(a>0){
            int val = a%10;
            int mul = 1;
            for(int i=1;i<=lens.length();i++){
                mul=mul*val;
            }
            a=a/10;
            result = result+mul;
        }

        if(b==result){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

}
