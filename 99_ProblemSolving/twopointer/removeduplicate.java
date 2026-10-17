package ProblemSolving.twopointer;
import java.util.*;
public class removeduplicate {
    public static ArrayList<Integer> removeduplicates(int[]arr){
        ArrayList<Integer> list = new ArrayList<>();
        if(arr.length<1){
            return list;
        }
        list.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]!=arr[i]){
                list.add(arr[i]);
            }
        }
        return list;
    }
    public static void main(String[]args){
        int[]arr={1,1,1,1,2,3,4,5,6,7,7,7,7,7,7,7,8,8,9,9,10,10,11,11,11,11,22,22,33,33,44,44,55,55,55,55,55,55,66,66,66,66,66,66,77};
        int[]ar={};
        System.out.println(removeduplicates(ar));
    }
}