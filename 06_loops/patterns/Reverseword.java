package loops.forloop.patterns;
import java.util.*;

public class Reverseword {
    static String reversetheword(String s){
        String[] words = s.split( " +");

        StringBuilder sp = new StringBuilder();

        for(int i=words.length-1;i>=0;i--){
            sp.append(words[i]);
            if(i>=1){
                sp.append(" ");
            }
        }
        return sp.toString().trim() ;

    }
    public static void main(String [] args){
       System.out.println(reversetheword(" the     world is for you "));
    }
    }