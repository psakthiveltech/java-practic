package inheritance.basics;

public class Cats extends Animals2{
    // it through the error like there is no no-argument constructor is there so i wan to say like this
    Cats(String vl){
        super("vals");
        name=vl;
        System.out.println("this is cat");
    }
    public static void main(String[] args){
        Cats c = new Cats("kitte");

    }

}
