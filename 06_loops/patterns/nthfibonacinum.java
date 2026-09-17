package loops.forloop.patterns;
import java.util.*;
public class nthfibonacinum {
    public static int nthfibnumfinder(int n){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);
        for(int i=2;i<=n;i++){
            list.add(list.get(i-2)+list.get(i-1));
        }
        return list.get(n);
    }
    public static void main(String[] args){
        System.out.println(nthfibnumfinder(12));
    }
}