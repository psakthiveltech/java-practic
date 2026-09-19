package array.loopinarray;

public class Forloopforarray {
    public static void main(String [] args){
        int[] arr={1,2,3,4,5,4,5,6,7,8,9,7,8,9,7,8,9,7,8,9};
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]%2==0){
                System.out.println("arr even values :"+ arr[i]);
            }
            else{
                System.out.println("arr odd values :"+ arr[i]);
            }

        }
    }
}
