package collection.map.basics;

import java.util.HashMap;

public class Basics {
    public static void main(String[] args){
        HashMap kv = new HashMap();
        kv.put("str",1230);
        kv.put("vji",0321);
        System.out.println(kv);
        System.out.println(kv.get("name"));
        System.out.println("putif absent : "+ kv.putIfAbsent( "hit" , 4569));
        System.out.println(kv);
        System.out.println("containsKey : " +kv.containsKey("vji"));
        System.out.println( "contains value : "+kv.containsValue("1230"));
        System.out.println();
    }
}
