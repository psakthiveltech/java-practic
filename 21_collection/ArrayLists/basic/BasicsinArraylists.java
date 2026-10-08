package collection.ArrayLists.basic;

import java.util.ArrayList;

public class BasicsinArraylists {
    public static void main(String [] args){
        ArrayList a1 = new ArrayList();
        for(int i=1;i<=10;i++){
            a1.add(i);
        }
        System.out.println(a1);
        a1.remove(3);
        System.out.println(a1);
        a1.add(0,0);
        System.out.println(a1);
        a1.set(0,4);
        System.out.println(a1);

        for(int i=4;i<=9;i++){
            System.out.println(a1.get(i));
        }
        System.out.println(a1);


    }
}
