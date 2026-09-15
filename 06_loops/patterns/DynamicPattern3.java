package loops.forloop.patterns;
import java.util.Scanner;
public class DynamicPattern3 {

    public static void main (String [] args){
        Scanner ss = new Scanner(System.in);
        System.out.println("enter the value");
        int n = ss.nextInt();
        for(int i=1;i<=n;i++){
            for(int j = 1 ; j<=(n-i)+1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if(k%2==0){
                    System.out.print(0+" ");
                }
                else{
                    System.out.print(1+" ");
                }
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++){
            for(int j = 1 ; j<=i+1;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(n-i);k++){
                if(k%2==0){
                    System.out.print(0+" ");
                }
                else{
                    System.out.print(1+" ");
                }
            }
            System.out.println();
        }
    }
}