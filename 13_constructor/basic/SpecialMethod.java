package constructor.basic;

public class SpecialMethod {
    int age;
    String name;
    public void getName(){
        System.out.println("The Name Is : "+name);
    }
    public SpecialMethod(){
        name="bro";
        age=0;
        System.out.println("The Name Is : "+name+"; and Age is : "+age+";");

    }
    public static void main(String [] args){
        SpecialMethod s = new SpecialMethod();
    }
}