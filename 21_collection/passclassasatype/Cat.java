package collection.passclassasatype;

public class Cat {
    String name;
    int age;
    public Cat(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void comeon(){
        System.out.println(name+" "+age);
    }
    public String toString(){
        System.out.println(name+" "+age);
        return "name : "+name+" "+", age : "+age ;
    }
}