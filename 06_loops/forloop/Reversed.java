package loops.forloop;

import java.util.Scanner;

public class Reversed {
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        String S = s.nextLine();
        String reveresed = "";
        for(int i=S.length()-1;i>=0;i--){
            reveresed+=S.charAt(i);
        }
        System.out.print(reveresed);
    }

}
