package ProblemSolving.twopointer;

import java.util.Arrays;

public class removelement {

    public static int removeelement(int[]arr,int val){
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[i]==val&&arr[j]!=val){
                arr[i]=arr[j];
                i++;
            }
            else if(arr[i]!=val){
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));

        return i;
    }
    public static void main(String[]args){
        int[]arr={0,1,2,2,3,0,4,2};

        System.out.println(removeelement(arr,2));
    }
}
