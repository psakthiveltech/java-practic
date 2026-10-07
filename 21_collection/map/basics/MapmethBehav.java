package collection.map.basics;

import java.util.HashMap;

public class MapmethBehav {
   public  static void main(String[] args) {
       HashMap<String,Integer> map = new HashMap<>();
       map.put("val",22);
       int val =map.get("val");
       System.out.println(val);
   }
}
