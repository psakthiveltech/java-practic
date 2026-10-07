package collection.map.basics;

import java.util.HashMap;
import java.util.Map;

public class NameRetrival {
    static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("spider-man",1234);
        map.put("iron-man",2234);
        map.put("thor",3234);
        map.put("cap",4234);
        map.put("hulk",5234);
        map.put("hawl",6234);
        map.put("natasha",7234);
        map.put("witch",8234);
        map.put("vision",9234);
        map.put("strange",10234);
        for(Map.Entry<String,Integer> val :map.entrySet()){
            System.out.println("welcome "+val.getKey() +"...");
        }

    }
}
