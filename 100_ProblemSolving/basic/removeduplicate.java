package ProblemSolving.basic;
import java.util.*;
public class removeduplicate {

    public static ArrayList remduplicate(int [] arr){

        ArrayList<Integer> list = new ArrayList<>();

        int i=0;
        int j=0;
        list.add(arr[j]);
        while(j<arr.length){
            if(arr[i]!=arr[j]){
                list.add(arr[j]);
                i=j;
            }
            j++;
        }
//        LinkedHashSet<Integer> set =  new LinkedHashSet<>();
//
//        for(int i : arr){
//            set.add(i);
//        }
//        ArrayList<Integer> list = new ArrayList<>(set);
//
        return list;
    }

    public static void main(String []args){
        int[] val={1,1,1,1,1,2,3,4,5,6};
        System.out.println(remduplicate(val));
    }

}