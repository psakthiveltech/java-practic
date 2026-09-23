package Classes;

public class Student {
    String name;
    int age;
    long rollNo;
    char classes;
    long num;
    public void accessAll(){
        System.out.println(name+","+age+","+rollNo+","+classes+","+num);
    }
    public static void main(String[] args){
        Student std1 = new Student();
        std1.name="ajay";
        std1.age=10;
        std1.rollNo=210124510;
        std1.classes = 'a';
        std1.num=98745632101L;
        std1.accessAll();
    }
}
