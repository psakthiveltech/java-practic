package interfaces.basic.animalexample;

public class deer implements prey{

    @Override
    public void flee() {
        System.out.println("the deer is fleeing");
    }
}
