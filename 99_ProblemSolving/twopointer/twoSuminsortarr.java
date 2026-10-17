package ProblemSolving.twopointer;

public class twoSuminsortarr {
    public static int[] twosum(int[] arr,int target){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==target){
                System.out.println(arr[i]+" "+arr[j]);
                return new int[] {arr[i],arr[j]};
            }
            else if(arr[i]+arr[j]>target){
                j--;
            }
            else{
                i++;
            }
        }

        return new int[] {-1,-1};

    }
    public static void main(String[]args){
        int[]arr = {3,8,11,11,11,15,19,19,21};
        System.out.println(twosum(arr,15));
    }
}
