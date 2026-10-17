package ProblemSolving.twopointer;

public class varsizewindow {
    public static int varsizedwindow(int[]arr,int target){
        int l=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        for(int r=0;r<arr.length;r++){
            sum +=arr[r];
            while(sum>=target){
                if(r-l+1<ans){
                    ans=r-l+1;
                }
                sum-=arr[l];
                l++;
            }
        }
        return ans;
    }
    public static void main(String[]args){
        int []arr = {2,3,1,2,4,3};
        System.out.println(varsizedwindow(arr,7));
    }
}