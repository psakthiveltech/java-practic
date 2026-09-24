package objectallPratice.basics;

import java.util.HashMap;

public class library {
    String name;
    String phno;
    static HashMap<String,Integer> map = new HashMap<>();
    HashMap<String,Integer>map1 = new HashMap<>();
    public static void bookDonation(String name,int vol){
        map.put(name,vol);
    }
    static void showBooks(){
        for(String  i : map.keySet()){
            System.out.println(i+" : "+map.get(i));
        }
    }
    void borrowBooks(String name,int count){

        if(map.get(name)==0){
            System.out.println("Book is not available now check later...");
        }
        else if((map.get(name))-count<0){
            System.out.println("your quantity is high so ask regarding to quantity so check it .");
        }
        else{
            map.put(name,map.get(name)-count);
            map1.put(name,count);
            System.out.println(name+" : "+map.get(name));
        }

    }
    static void donateBooks(String name,int count){
        if(map.containsKey(name)){
            map.put(name,map.getOrDefault(name,0)+count);
        }
        else{
            map.put(name,count);
        }
        System.out.println("Newly added : '"+name+"' , quantity : "+map.get(name));
        System.out.println("Thankyou ...");
    }

    void giveBooks(String name,int count){
        map1.remove(name);
        map.put(name,map.get(name)+count);

        System.out.println("Newly added : '"+name+"' , quantity : "+map.get(name));

    }
    void mybooks(){
        if(map1.isEmpty()){
            System.out.println("Empty go to get");
        }
        else{
            for(String i : map1.keySet()){
                System.out.println(i+" ,Quantity : "+map1.get(i));
            }
        }

    }

    public static void main(String[]args){}

}
