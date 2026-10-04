package interfaces.basic.animalexample;


public class Tiger implements predator{

    @Override
    public void hunt() {
        System.out.println("Tiger is on hunting");
    }

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.hunt();
        deer deer1 = new deer();
        deer1.flee();
        corcodail corck = new corcodail();
        corck.flee();
        corck.hunt();
    }
}