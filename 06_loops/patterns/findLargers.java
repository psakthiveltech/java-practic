package loops.forloop.patterns;

public class findLargers {

    public static int largestval(int[] n){
        int val = Integer.MIN_VALUE;
        for(int i : n){
            if(i>val){
                val=i;
            }
        }
        return val;
    }
    public static void main(String[]args){
        int[] vals = {0,12,1,3,0,4,54,848,1,54,788,955,5521,021,4848,487878,784127};
        System.out.print(largestval(vals));
    }
}
