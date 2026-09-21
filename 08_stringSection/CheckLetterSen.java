package stringSection;
import java.util.*;
public class CheckLetterSen {
    static String checker(String s){
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<s.length();i++){
            String vals = Character.toUpperCase(s.charAt(i))+"";
            if(vals.equals(s.charAt(i)+"")){
                String val = Character.toLowerCase(s.charAt(i))+"";
                sb.append(val);
            }
            else{
                String val = Character.toUpperCase(s.charAt(i))+"";
                sb.append(val);
            }
        }
        return sb.toString();
    }


    public static void main(String[]args){
        System.out.println(checker("cHeCk"));

    }


}
