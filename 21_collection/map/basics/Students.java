package collection.map.basics;

public class Students {
    int rollno;
    String name;
    char Section;

    void sayName(){
        System.out.println("Greeting's my name is "+name+" my rollno is "+rollno+" and my sectin is "+Section);
    }
    public Students(int rollno,String name,char Section){
        this.rollno=rollno;
        this.name=name;
        this.Section=Section;
    }
}
