package array.tasks;

public class AddAnArray {
    public static void main(String [] args) {
        int []num = {1,2,3,4,5,6,7,8,9,10,11};
        int val=0;
        for(int i=0;i<num.length;i++){
            val+=num[i];
        }
        System.out.println(val);
    }
}