package scannerMethods;

import java.util.Scanner;

public class GetOutputAndShowprint {
    Scanner s = new Scanner(System.in);
    public void outputGetter(){
        System.out.println("Enter u r fav Superhero name any one 1st letter i will guess :");
        String guessName=s.nextLine().toLowerCase();
        switch(guessName){
            case "s":
                System.out.println("spiderman");
                break;
            case "su":
                System.out.println("superman");
                break;
                default:
                System.out.println("This Is Out Of Syllabus :)");
        }
    }
    public static void main(String[] args){
        GetOutputAndShowprint g = new GetOutputAndShowprint();
        g.outputGetter();
    }
}
