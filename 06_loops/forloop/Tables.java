package loops.forloop;

import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter u r table number : ");
        int num = s.nextInt();
        for (int i = 1;i<=10; i++){
            System.out.println(num+"x"+i+ "=" + i*num);
        }
    }
}
