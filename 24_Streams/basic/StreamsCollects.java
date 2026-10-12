package Streams.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsCollects {
    public static void main(String[] args){
        ArrayList<Integer> l =  new ArrayList<>();
        for(int i=10;i<=80;i+=10){
            l.add(i);
        }

        List<Integer> list =  l.stream()
                .filter(i->i>20)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
