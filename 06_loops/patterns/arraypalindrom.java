package loops.forloop.patterns;

public class arraypalindrom {

    public static boolean checkarrpalin(int[]arr){
        int stval=0;
        int endval = arr.length-1;
        if(arr.length <2) return false;
        while(stval<endval){

            if(arr[stval]!=arr[endval]){
                return false;
            }
            else{
                stval++;
                endval--;
            }

        }
        return true;
    }
    public static void main(String[] args){
        int[] arr1 = {1,2,3,3,2,1};
        System.out.print(checkarrpalin(arr1));
    }
}