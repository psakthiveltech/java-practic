package polymorphism.methodoverriding;

public class BaseClass extends SuperClass{
    @Override
    public void mobile(){
        System.out.println("Iphone Model 15 Pro Max");
    }
    public void CarModel(){
        System.out.println("Car model new roles royes ");
    }
    public static void main(String []args){
        BaseClass B = new BaseClass();
        B.mobile();
        B.CarModel();
    }

}
