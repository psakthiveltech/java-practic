package collection.ArrayLists.lists;

import java.util.ArrayList;

public class AddallRemoveall {
    public static void main(String[]args){
        ArrayList  al= new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add("hello");
        ArrayList  obj= new ArrayList();
        obj.add(10);
        obj.add("hello");
        obj.addAll(1,al);
        System.out.println("After addAll : "+obj);
//        obj.removeAll(al);
//        System.out.println("After removeAll : "+obj); behaviour is if the al elemt have same as data similiar it removed when u try to do this so use it wisly
        obj.retainAll(al);
        System.out.println("After retainALl : "+obj);


    }
}
