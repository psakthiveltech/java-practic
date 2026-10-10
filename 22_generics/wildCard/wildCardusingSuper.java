package generics.wildCard;

import java.util.ArrayList;

public class wildCardusingSuper {
    public void callingThisMeth(ArrayList<? super Integer> list){
        System.out.println(list);
    }
    public static void main(String[]args){
        wildCardusingSuper s = new wildCardusingSuper();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(81120);
        list.add(7801);
        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(40.4550);
        list2.add(74.848);
        System.out.println("this is Integer");
        s.callingThisMeth(list);
        //s.callingThisMeth(list2); // this is not work for super because
        // it goes upwards like which is Integers parent clas so it goes there,
        //  that's it....
        ArrayList<Number> lis = new ArrayList<>();
        lis.add(1450);
        lis.add(455454);
        System.out.println("this is number");
        s.callingThisMeth(lis );

    }
}
