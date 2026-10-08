package collection.ArrayLists.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class MiddleElement {
    public static void main (String[] args){
        ArrayList<Integer> aList = new  ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("enter the size of your list");
        int sizes = s.nextInt();
        for(int i = 1 ; i <=sizes ;i++){
            System.out.println("Enter u r numbers");
            int getVal = s.nextInt();
            aList.add(getVal);
        }
        System.out.println("Your Arrays middle value is "+aList.get(aList.size()/2));
        System.out.println(aList.size());
    }
}