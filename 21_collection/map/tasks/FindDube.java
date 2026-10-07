package collection.map.tasks;

import java.util.ArrayList;
import java.util.HashMap;

public class FindDube {
    static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer > arlist = new ArrayList<>();
        int[] arr =new int[4];
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        arr[3]=4;

        for(int t : arr){
            if(!map.containsKey(t)){
                map.put(t,1);
            }
            else{
                map.put(t,map.get(t)+1);
            }
            if(map.containsKey(t)&&map.get(t)==2){
                arlist.add(t);
            }
        }
        System.out.println(arlist);
    }
}
