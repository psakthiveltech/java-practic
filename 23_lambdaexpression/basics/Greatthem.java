package lambdaexpression.basics;

import java.util.ArrayList;

public class Greatthem{
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<String> list1 = new ArrayList<>();

        list.add(10);
        list.add(40);
        list.add(50);
        list.add(50);
        list.add(70);
        list.add(90);

        list1.add("kkenfse");
        list1.add("sdf");
        list1.add("sd");
        list1.add("sdf");
        list1.add("fss");

        list.forEach(System.out::println);

        list1.forEach(System.out::println);


    }
}
