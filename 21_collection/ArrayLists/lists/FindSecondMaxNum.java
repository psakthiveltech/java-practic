package collection.ArrayLists.lists;

import java.util.ArrayList;

public class FindSecondMaxNum {
    public static void main (String [] args){
        ArrayList<Integer> aList = new ArrayList<>();
        for(int i=1;i<=10;i++){
            aList.add(i);
        }
        aList.add(2);
        aList.add(4);
        aList.add(100);
        aList.add(200);
        int max = 0;
        int secMax = 0;
        System.out.println(aList);
        for(int i : aList){
            if(i>max){
                max=i;
            }
        }
        aList.remove(aList.indexOf(max));
        for(int i: aList){
            if(i>secMax){
                secMax=i;
            }
        }
        System.out.println(secMax);

    }
}