package behaviourOfJava.basics;

public class Object {
    int engineNo=1;
    String name = "Bike";
    public static void main (String [] args){
        Object bullet = new Object();
        Object splender = bullet;
        splender.name = "splender bike";
        System.out.print(bullet.name);
    }
}