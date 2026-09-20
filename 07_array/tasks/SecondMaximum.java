package array;

import java.util.Arrays;

public class SecondMaximum {
    public static void main(String[] args){
       int n=5;
       int[] arr = new int[n];
       for(int i=0;i<=n-1;i++){
           if(i<2){
               arr[i]=i;
           }
           else if(i>=2){
               arr[i]=arr[i-2]+arr[i-1];
           }
       }
       System.out.print(Arrays.toString(arr));
    }
}