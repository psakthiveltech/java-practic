package loops.forloop.patterns;
import java.util.*;
public class factorial {

    public static int factorials(int n){
        List <Integer> list = new ArrayList<>();
        list.add(1);
        int value=1;
        for(int i=2;i<=n;i++){
            value*=i;

            list.add(value);
        }
        System.out.println(list);
        return value;
    }
    public static void main(String[] args){
        System.out.print(factorials(10));
    }
}
