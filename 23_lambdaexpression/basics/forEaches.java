package lambdaexpression.basics;

import java.util.ArrayList;

public class forEaches {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("rajini");
        list.add("kamal");
        list.add("vijay");
        list.add("ajith");
        list.sort((a,b)->a.length()-b.length());

        System.out.println(list);

        list.forEach(e-> System.out.println("the actor name is : " + e));

        list.forEach(e-> System.out.println("he is "+e.toUpperCase()));

    }
}
