package loops.forloop;

public class AddorEven {
    public static void main(String[] args) {
        for (int i=1; i<=10;i++){
            if(i%2==0){
                System.out.println("this is even"+i);
            }
            else{
                System.out.println("this is odd"+i);
            }
        }
    }
}
