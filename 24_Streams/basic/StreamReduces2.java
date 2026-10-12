package Streams.basic;

import java.util.ArrayList;

public class StreamReduces2 {
    public static void main(String[] args){
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=1;i<=100;i++){
            l.add(i);
        }
        int val = l.stream()
                .reduce(0,(a,b)->a+b);
        System.out.println(val + " this is the sum of 1 to 100 ");
    }
}