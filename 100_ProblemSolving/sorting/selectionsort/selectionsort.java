package ProblemSolving.sorting.selectionsort;

import java.util.Arrays;

public class selectionsort {
    public static void selectsort(int []arr){
        int min=0;
        int minind=0;
        for(int i=0;i<arr.length;i++){
            min=arr[i];
            minind=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<min){
                    minind=j;
                    min=arr[j];
                    System.out.println(i+"i val");
                    System.out.println(j +" : index");
                    System.out.println(min + " minvalue");
                }

            }

            int val=arr[i];
            arr[i]=arr[minind];
            arr[minind]=val;
            System.out.println(Arrays.toString(arr));

        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[]args){
        int[]arr = {9,7,8,0};
        selectsort(arr);
    }

}
