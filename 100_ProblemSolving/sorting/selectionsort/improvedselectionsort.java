package ProblemSolving.sorting.selectionsort;

import java.util.Arrays;

import static java.util.Collections.swap;

public class improvedselectionsort {
    public static void selectsorting(int[]arr){
        int i,index=0;
        for(i=0;i<arr.length;i++){
            index=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[index]){
                    index=j;
                }
            }
            if(index!=i){
                int temp=arr[i];
                arr[i]=arr[index];
                arr[index]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[]args){
        int[]arr = { 7,8,4,5,9,6,1,2,3,4};
        selectsorting(arr);
    }
}
