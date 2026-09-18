package loops.forloop.patterns;
import java.util.Scanner;
public class SecondDyanamicpatern {
    public void pattern3(){
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        for(int i = 1 ; i <= num ; i++){
            for(int j=1;j<=i;j++){
                System.out.println("Hello");
            }
        }
    }
    public static void main(String[] args){
        SecondDyanamicpatern sd = new SecondDyanamicpatern();
        sd.pattern3();
    }


}
