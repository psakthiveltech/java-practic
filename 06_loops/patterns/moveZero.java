package loops.forloop.patterns;
import java.util.*;
public class moveZero {

    public static void moveZerotoend(int[] arr){
    ArrayList<Integer> list = new ArrayList<>();
    int count = 0;
    for(int i : arr){
        if(i==0){
            count++;
        }
        else{
            list.add(i);
        }
    }

    for(int i=1;i<=count;i++){
        list.add(0);
    }
    System.out.println(list);
        System.out.print(count);

    }

    public static void main(String[] args){
        int[] arrs = {1,0,2,3,4,5,0,7,8,9,4,5,1,0,0,0,0,4,5,7,5,41,0,1,4,5};
        moveZerotoend(arrs);
    }
}
