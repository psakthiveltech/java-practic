package exceptionHandling.basics;

public class exceptionpropaganation {
    public static void methC(){
        int i = 10/0;
    }
    public static void methB(){
        methC();
    }
    public static void main(String[]args){
        try{
            methB();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


}
