package generics.Basics;
import java.util.*;
public  class understandingcat {

    public static void callhim() {


        ArrayList<Cat> list = new ArrayList<>();
        Cat c1 = new Cat("kitty");
        list.add(c1);
        list.add(new Cat("lucy"));
        System.out.println(list.get(0).name);
        System.out.println(list.get(1).name);


    }
    public static void main(String[]args){
        callhim();
    }

}