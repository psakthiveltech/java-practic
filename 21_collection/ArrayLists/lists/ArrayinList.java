package collection.ArrayLists.lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayinList {
    public static void main (String[]args){
        List al = new ArrayList();
        al.add(1);
        al.add('t');
        al.add("Three");
        al.add(123);
        al.add(123);
        System.out.println(al.get(1));
        int sizes = al.size();
        System.out.println(sizes);
        System.out.println(al.set(4,"four"));
        System.out.println(al);
        al.remove("Three");
        System.out.println(al);
//        al.clear();
        System.out.println(al);
//        boolean a = al.isEmpty();
//        System.out.println(al.isEmpty());
        System.out.println(al.indexOf("four")+" this is the index fo four ");

//        if(a == true){
//            System.out.println("Is empty array");
//        }
//        else{
//            System.out.println("the array have elements");
//        }





    }
}
