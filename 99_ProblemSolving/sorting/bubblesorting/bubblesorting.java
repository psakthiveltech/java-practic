package ProblemSolving.sorting.bubblesorting;

import java.util.Arrays;

public class bubblesorting {
    public static int[] bubblesorting(int[]arr){
        boolean counter = false;
        for(int i=0;i<arr.length-1;i++){
            counter = false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = temp;
                    counter=true;
                }
            }
            if(!counter){
                System.out.println(counter);
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
    public static void main(String[]ars){
        int[]arr={1,2,3,4,5,6};
        bubblesorting(arr);
    }
}