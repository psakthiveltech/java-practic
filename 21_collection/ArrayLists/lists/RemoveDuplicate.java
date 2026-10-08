package collection.ArrayLists.lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//[5, 3, 8, 3, 9, 5, 1, 8]
public class RemoveDuplicate {
    public static void main(String[] args){
        List<Integer> org =new ArrayList<Integer>(Arrays.asList(5, 3, 8, 3, 9, 5, 1, 8));
        List<Integer> removedub = new ArrayList<>();
        System.out.println(org);
        for(Integer i : org){
            if(!removedub.contains(i)){
                removedub.add(i);
            }
            System.out.println(removedub);
        }
    }
}