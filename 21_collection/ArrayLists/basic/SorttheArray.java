package collection.ArrayLists.basic;

import java.util.ArrayList;
import java.util.Collections;

public class SorttheArray {
    public static void main(String[] args){
        ArrayList<Integer> a1 = new ArrayList<>();
        for(int i =10;i>0;i--){
            a1.add(i);
        }
        System.out.println(a1);
        Collections.sort(a1);
        System.out.println(a1);
    }
}
