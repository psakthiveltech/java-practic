package stringSection;

import java.util.Scanner;

public class ReverseTheWord {
   public static String reversedWord(){
       Scanner s = new Scanner(System.in);
//        String result ="java is fun";
       String word = s.nextLine();
       String [] reversed = word.split(" " );
       String res = "";
       for(int i=reversed.length-1;i>=0;i--){
           if(i<=0){
               res+=reversed[i];
           }
           else{
               res+=reversed[i]+" ";
           }

       }
       System.out.println(res);
       return res;
   }
    static void main() {
        reversedWord();


    }
}
