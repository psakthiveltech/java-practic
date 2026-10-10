package generics.wildCard;

import java.util.ArrayList;

public class wildCardinArrayLists {
    public  void wildtest(ArrayList<? extends Number> list){


        System.out.println(list);
    }
    public static void main(String[]args){
        wildCardinArrayLists l = new wildCardinArrayLists();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Character> list3 = new ArrayList<>();
        list3.add('v');
        list3.add('d');
        list3.add('g');
        list.add(10);
        list.add(14);
        list.add(19999);
        list2.add("10 members");
        list2.add("14 members");
        list2.add("19999 members");
        l.wildtest(list);
//        l.wildtest(list2);
//        l.wildtest(list3);

        // These are not extensive the number that is the reason they is not working
    }

}
