package polymorphism.methodOverloading;

public class MethodOverloading1 {
    public void employee(){
        System.out.println("Employee Detail");
        System.out.println("***************");
    }
    public void employee(String name){
        System.out.println("Employee Name is :"+name);
    }
    public void employee(int age,String qualification){
        System.out.println("The Emplotee's Age :" +age);
        System.out.println("The Emplotee's Qualification :" +qualification);
    }
    public void employee(long phNo,int gradguate,String skill){
        System.out.println("The Employee's Phone number :"+phNo);
        System.out.println("The Employee's gradguate :"+gradguate);
        System.out.println("The Employee's skill :"+skill);
    }
    public static void main(String []args){
        MethodOverloading1 m = new MethodOverloading1();
        m.employee();
        m.employee("kavin");
        m.employee(24,"asmosian");
        m.employee(987456321L,1997,"fighting");
    }
}
