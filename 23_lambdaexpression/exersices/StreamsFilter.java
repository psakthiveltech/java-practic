package lambdaexpression.basics;

import java.util.ArrayList;

public class StreamsFilter {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        for(int i=1;i<9;i++){
            list.add(i);
        }
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("this is original list");
        list.forEach(System.out::println);
        System.out.println("this is filtered list :-");

        list.stream()
                .filter(n->n%2!=0)
                .forEach(System.out::println);
    }
}