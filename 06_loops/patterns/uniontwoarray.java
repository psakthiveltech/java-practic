package loops.forloop.patterns;
import java.util.*;
public class uniontwoarray {

    public static void unionArray(int[] arr1 , int[] arr2){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for(int i : arr1){
            set.add(i);
        }
        for(int j : arr2){
            set.add(j);
        }
        ArrayList<Integer> list = new ArrayList<>(set);

        Collections.sort(list);

        System.out.println(list);

    }
    public static void main(String [] args){
        int[] arrs = {1,2,3,4,5,6,6,7,8,9,7,8,9,4,5,6,121,121,323,545,6,7,6};
        int[] arrse = {1,2,3,4,5,6,6,7,8,9,7,8,9,7,9};
        unionArray(arrs,arrse);
    }

}
