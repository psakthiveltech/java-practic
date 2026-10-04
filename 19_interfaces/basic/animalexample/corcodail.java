package interfaces.basic.animalexample;

public class corcodail implements predator,prey{
    @Override
    public void hunt() {
        System.out.println("the corcodail is hunting");
    }

    @Override
    public void flee() {
        System.out.println(" the corcodail is fleeing from some animal ");
    }
}
