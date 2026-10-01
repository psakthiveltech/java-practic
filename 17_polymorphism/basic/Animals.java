package polymorphism.basic;

public class Animals {
    void sound(){
        System.out.println("I can Make a sound...");
    }
    public static void main(String[] args){
        Animals[] animals = { new Dog(),new Cat() ,new Cow() , new Sheep()};
        for(Animals a : animals){
            a.sound();
        }
    }
}
