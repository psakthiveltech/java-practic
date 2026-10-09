package generics.Basics;

import java.util.ArrayList;

public class CollectionsExe {
    static ArrayList<Integer> list = new ArrayList();
    static ArrayList<String> list2 = new ArrayList();
    static ArrayList<Long> list3 = new ArrayList();
    static ArrayList<Short> list4 = new ArrayList();
    static ArrayList<Character> list5 = new ArrayList();



    static void share(int[] arr){
        //list.add("val"); //it doesn't allow string and any type only accept which is declared inside <>
        for(Integer i : arr){
            list.add(i);
        }
        System.out.println(list);
    }

    static void share2(String[]arrs){
        for(String s : arrs){
            list2.add(s);
        }
        System.out.println(list2);
    }

    static void longs(long[]arr){
        for(long k :arr){
            list3.add(k);
        }
        System.out.println(list+"this is long");
    }

    static void shorts(short[]arr){

        for(short s :arr){
            list4.add(s);
        }
        System.out.println(list4+"this is short");
    }

    static void chars(char[]arr){
        for(char c :arr){
            list5.add(c);
        }
        System.out.println(list5+"");
    }
    public static void main(String[]agrs){
        int []arr = {11,2,3,4,5,6,789,78,4455};
        String[]arrs = {"dog","cat","wolf","cow","bat"};
        long []arl={11121,544,44,655454,787874,215478};
        short[]ars={1,2,3,4,5,6,7};
        char[] ch = {'d','d','f','f','s','o','r','p'};
        share(arr);
        //share2(arr); // showing error
        share2(arrs);
        longs(arl);
        shorts(ars);
        chars(ch);
    }

}
