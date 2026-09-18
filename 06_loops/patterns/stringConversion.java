package loops.forloop.patterns;
import java.util.*;

public class stringConversion {
    public static void stringconvertions(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        LinkedHashSet<Character> set = new LinkedHashSet<>();

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }

        for (Character i : set) {
            System.out.print(i+""+map.get(i));
        }

    }static void main (String[]arg){
        String st = "dhfkjdshfkjlhsdfkh";
        stringconvertions(st);
    }
}
