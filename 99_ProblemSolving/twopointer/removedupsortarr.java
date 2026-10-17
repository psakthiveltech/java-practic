package ProblemSolving.twopointer;
import java.util.*;
public class removedupsortarr {
    public static ArrayList removeduplicate(int[] arr){

        ArrayList<Integer> list = new ArrayList<>();
        int i=0;
        int j=0;
        list.add(arr[0]);
        while(j<arr.length){
            if(arr[i]!=arr[j]){
                list.add(arr[j]);
                i=j;
            }
            else{
                j++;
            }

        }
        return list;
    }
    public static void main(String[]args){
        int[]arrs = {0,0,1};
        System.out.println(removeduplicate(arrs));
    }
}