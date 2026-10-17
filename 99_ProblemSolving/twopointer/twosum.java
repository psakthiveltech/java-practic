package ProblemSolving.twopointer;

public class twosum {
    public static int[] twosum(int[] arr, int target){
        int first=0;
        int second=0;
        int i=0;
        int j=arr.length-1;

        while(i<j){
            int val = arr[i]+arr[j];
            if(val==target){
                first=arr[i];
                second = arr[j];
                System.out.println(first+" "+second);
                return new int[] {first,second};
            }
            else if(val>target){
                j--;

            }
            else{
                i++;
            }
        }
        System.out.println("no");
        return new int[] {-1,-1};
    }
    public static void main(String[]args){
        int[]arr={1,2,4,6,10,15};
        System.out.println(twosum(arr,5));
    }
}
