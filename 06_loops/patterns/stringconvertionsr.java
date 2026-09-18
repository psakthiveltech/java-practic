package loops.forloop.patterns;
import java.util.*;
public class stringconvertionsr {
    public static void stringconver(String s ){
        StringBuilder sb = new StringBuilder();

        int count = 1;

        for(int i=0;i<s.length();i++){
            if(i+1<s.length()&&s.charAt(i)==s.charAt(i+1)){
                count++;
            }
            else{
                sb.append(s.charAt(i));
                sb.append(count);
                count=1;
            }
        }
        System.out.print(sb.toString());

    }
    public static void main(String[] sar){
stringconver("aabbbababbbbcccmm");
    }
}
