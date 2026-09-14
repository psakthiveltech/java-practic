package loops;

import java.util.Scanner;

public class Whileloopguess{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Guess Your number 0-10 ? ");
        int guess = s.nextInt();
        int num = 7;
        while(guess!=num){
            if (guess <= 7) {
                System.out.println("again guess u r number u r guess is low : ");
                guess=s.nextInt();
            }
            else{
                System.out.println("again guess u r number u r guess is high : ");
                guess=s.nextInt();
            }
        }
        System.out.println("u got it !");
    }
}