package lambdaexpression.basics;

import java.util.ArrayList;

public class streamsdictrincts {
    public static void main(String[] args){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(4);
        l.add(3);
        l.add(2);
        l.add(1);
        l.add(3);
        l.add(1);


        System.out.println("actual list " + l.size());
        System.out.println(l);
        System.out.println("new list");
        l.stream()
                .distinct()
                .forEach(System.out::println);

    }
}
