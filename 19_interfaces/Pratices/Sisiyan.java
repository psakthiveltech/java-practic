package interfaces.Pratices;

public class  Sisiyan implements Guru {
    public void lessons(){
        System.out.println("guru didnt tell but i can tell what it is ");
    }
    public static void main (String [] args){
        Sisiyan s = new Sisiyan();
        s.lessons();
    }
}
