package lambdaexpression.basics;

import java.util.ArrayList;

public class StreamsMap {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i=1;i<=10;i++){
            list.add(i);
        }
        list.stream()
                .map(n->n*4)
                .forEach(System.out::println);
        System.out.println(list);

    }
}
