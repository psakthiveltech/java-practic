package ProblemSolving.sorting.insertionsort;

import java.util.ArrayList;
import java.util.Arrays;

public class insertionsort {

    public static void insertionsorting(int []arr){
        int key=0;
        int j=0;
        for(int i=1;i<arr.length;i++){
            key=arr[i];
            j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[]args){
        int[] arr = { 10,2,4,7,5,10,44,55,77};
        insertionsorting(arr);
    }
}
