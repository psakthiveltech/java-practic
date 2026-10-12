package Streams.basic;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class StreamSorting {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=10;i>0;i--){
            list.add(i);
        }

        System.out.println("actual list : " +list);
       ArrayList<Integer> l = list.stream()
                .sorted()
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(l);
    }
}
