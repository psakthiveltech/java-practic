package Streams.basic;

import java.util.ArrayList;

public class StreamReduce {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=100;i+=1){
            list.add(i);
        }
        int val =list.stream()
                .reduce(0,(a,b)->a+b);
        System.out.println(val);
    }
}