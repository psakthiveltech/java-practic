package collection.ArrayLists;

import java.util.ArrayList;

import java.util.Scanner;

public class LoopinputArrayList {
   public static void main(String[] args){
       Scanner s = new Scanner(System.in);

       ArrayList<String> Heros = new ArrayList<String>();
       for(int i=1;i<=10;i++){
           System.out.println("Enter u r favirout heros");
           String nameofheros = s.nextLine();
           Heros.add(nameofheros);
       }
       System.out.println(Heros);

       s.close();
    }
}
