package Streams.basic;

import java.util.ArrayList;

public class StreamSorting2 {
    public static void main(String[] args){
    ArrayList<String> s = new ArrayList<>();
        s.add("tom");
        s.add("will");
        s.add("bratbit");
        s.add("johnson");
        s.add("hendry");

        s.stream()
                .sorted((a,b)->a.length()-b.length())
                .forEach(y-> System.out.println(y));
    }
}
