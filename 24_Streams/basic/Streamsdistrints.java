package Streams.basic;

import java.util.ArrayList;

public class Streamsdistrints {
    public static void main(String[] args){
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=1;i<=100;i++){
            l.add(i);
        }
        for(int i=1;i<=100;i++){
            l.add(i);
        }
        System.out.println(l);
        l.stream()
                .distinct()
                .forEach(System.out::println);
    }
}