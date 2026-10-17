package ProblemSolving.twopointer;

import java.util.Arrays;

public class reverseaarray {
    public static void removearrs(int[]arr){
        int i=0;
        int j=arr.length-1;
        System.out.println(Arrays.toString(arr));
        while(i<j){
            int val=arr[i];
            arr[i]=arr[j];
            arr[j]=val;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[]args){
        int[]arr={1,2,3,4,4,5,6,7,8,9};
        removearrs(arr);
    }
}