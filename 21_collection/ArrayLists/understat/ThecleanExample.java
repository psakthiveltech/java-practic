package collection.ArrayLists;

import java.util.ArrayList;

public class ThecleanExample {
  public static void main(String[] args){
      ArrayList <String> Fruittray = new ArrayList <String>();
      Fruittray.add(0,"small Apple");
      Fruittray.add(1,"medium Apple");
      Fruittray.add("big Apple 🍎");
      Fruittray.set(1,"Big Apple");
      Fruittray.set(0,"Big Apple");
      Fruittray.add("smushed Apple");
      Fruittray.remove(3);
      System.out.println(Fruittray);
      System.out.println(Fruittray.get(2));
      System.out.println(Fruittray.size());
  }
}