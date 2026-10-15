package ProblemSolving.basic;
import java.util.*;
public class rotateArrone {
    public static void rotatearrbyone(int [] arr){
        List<Integer> list = new ArrayList<>();
        int val=0;
        int last=arr[arr.length-1];
//        int cal=val;
//        for(int i=0;i<arr.length;i++){
//            if(i==0){
//                val=arr[i];
//                arr[i]=last;
//                cal=val;
//            }
//            else{
//
//                val=arr[i];
//                arr[i]=cal;
//                cal = val;
//            }
//        }
//           THIS IS MY METHOD IN ABOVE 


        for(int i = arr.length-1;i>=0;i--){
            if(i>=1){
                arr[i]=arr[i-1];
            }
        }
        arr[0]=last;

        for(int i :arr){
            list.add(i);
        }
        System.out.print(list);
    }

    public static void main(String[]a){
        int[] arrs ={1,2,3,4,5};
        rotatearrbyone(arrs);
    }
}
