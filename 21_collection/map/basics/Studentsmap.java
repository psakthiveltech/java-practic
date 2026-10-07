package collection.map.basics;

import java.util.HashMap;

public class Studentsmap {
    public static void main(String[] args){
        HashMap<Integer,Students> map= new HashMap<>();
        map.put(001,new Students(01,"abinaya",'c'));
        map.put(002,new Students(02,"ravi",'c'));
        map.put(003,new Students(03,"bhuvi",'c'));
        map.put(004,new Students(04,"saranya",'c'));
        map.put(005,new Students(05,"vetika",'c'));
        map.put(006,new Students(06,"zambu",'c'));

        for(Integer i : map.keySet()){
            System.out.println("Reg no : "+i +" Student details : "+map.get(i).name);
            map.get(i).sayName();
        }
    }
}
