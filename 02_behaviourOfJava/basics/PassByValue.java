package behaviourOfJava.basics;

public class PassByValue {
    static void valChanger(int val){
        val=20;
        System.out.println("This value from the method : "+val);
    }

    static void main(String[] args) {
        int val = 10;
        valChanger(val);
        System.out.println("outer value is : "+val);
    }

}
