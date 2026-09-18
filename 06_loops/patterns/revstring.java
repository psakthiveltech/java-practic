package loops.forloop.patterns;
import java.util.*;
public class revstring {
    public static String revstr(String s){
        StringBuilder sb = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public static void main(String[]args){
        System.out.print(revstr("this the hsdjjfhj aoihfioashf"));
    }
}
