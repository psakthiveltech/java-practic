package collection.ArrayLists;

import java.util.ArrayList;

public class TheArrayLists {
    public static void main (String [] args){
        ArrayList<Integer> aList = new ArrayList<>();
        for(int i=1;i<=10;i++){
            aList.add(i);
        }
        boolean contains = aList.contains(5);
        System.out.println(aList);
        aList.set(1,aList.get(1)*100);
        System.out.println(aList);
        aList.remove(9);
        System.out.println(aList);
        System.out.println(contains);
        System.out.println(aList);
        System.out.println(aList.isEmpty());
        for ( int i : aList){
            System.out.println(i);
        }
    }
}