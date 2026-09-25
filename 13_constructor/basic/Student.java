package constructor.basic;

public class Student {
    int roll;
    String name;
    float mark;

    Student(int roll,String name,float mark){
        this.roll=roll;
    this.name = name;
    this.mark = mark;
    }
    public static void main(String []args){
        Student st1 = new Student(1,"abisa",77);
        Student st2 = new Student(2,"baanu",88);
        Student st3 = new Student(3,"charlin",44);
        Student st4 = new Student(4,"deepak",45);
        Student st5 = new Student(5,"einstine",17);
//        Student st11 = new Student();

        System.out.println(st1.name);
        System.out.println(st2.name);
        System.out.println(st3.name);
        System.out.println(st4.name);
        System.out.println(st5.name);
    }

}
