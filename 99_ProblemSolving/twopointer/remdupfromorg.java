package ProblemSolving.twopointer;
import java.util.*;
public class remdupfromorg {
    public static void removedupes(int[]arr){
    int i=0;
    for(int j=0;j<arr.length;j++){
        if(arr[i]!=arr[j]){
            i++;
            arr[i]=arr[j];
        }
    }
        System.out.println(Arrays.toString(arr));
        System.out.println(i+1);
    }
    public static void main(String[]args){
        int[]arr={1,1,1,2,2,2,2,3,3,3,3,4,4,4,5,6,7,8,8,9,8,5};
        removedupes(arr);
    }
}