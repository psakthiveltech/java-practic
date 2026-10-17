package ProblemSolving.twopointer;

import java.util.Arrays;

public class reversearr {
    public static void reversingarr(int[]arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int val=arr[j];
            arr[j]=arr[i];
            arr[i]=val;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[]args){
        int[] arr={1,2,3,4,5,6,6,6,7,8,9};
        reversingarr(arr);
    }
}
