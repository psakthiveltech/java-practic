package collection.map.basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Basicaccess {
    static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap();
        map.put(1001,"vimal");
        map.put(1002,"dhrasem");
        map.put(1003,"jaya");
//        System.out.println("Hi "+map.get(1002)+" welcome to out company...!");
        for(Entry<Integer,String> m:map.entrySet()){
            System.out.println("Hi " +m.getValue() +" welcome to our company  \n And this is your ID card number : "+m.getKey() );
        }
    }
}
