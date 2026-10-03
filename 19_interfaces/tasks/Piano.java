package interfaces.tasks;

public class Piano implements Playable {
    public void sound(){
        System.out.println("Lets Play Piano");
    }
    public static void main(String [] args){
        Guitar g = new Guitar();
        Piano p = new Piano();
        g.sound();
        p.sound();
    }
}