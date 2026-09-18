package loops.forloop.patterns;
import java.util.*;
public class secondlar {
    public static int seondmax(int[] arr){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();


        for(int i: arr){
            set.add(i);
        }
        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        list.reversed();
        if(list.size()<2) return -1;
        return list.get(list.size()-2);
    }
    public static void main(String []a){
        int[] arrs = {20,30,40,80,10,20,5,2,3,40,40,80,55,79};
        System.out.print(seondmax(arrs));
    }
}
