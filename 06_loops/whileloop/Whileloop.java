package loops;

import java.util.Scanner;

public class  Whileloop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter u r starting number : ");
        int starting = s.nextInt();
        System.out.println("Enter u r end number :");
        int ending = s.nextInt();
        while(starting<=ending){
            System.out.println("hi am is now "+starting);
            starting++;
            s.close();
        }
    }
}
