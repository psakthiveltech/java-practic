package conditionalstatements.switchstatements;
import java.util.Scanner;
public class IdentityChecker {
    Scanner s = new Scanner(System.in);


    public void exposeIdentity(){
        System.out.println("Enter u r fav superhero name i will tell thier real identity");
        String nameOfSuperHero = s.nextLine().toLowerCase();
        switch(nameOfSuperHero){
            case "iron-man":
            System.out.println("tony stark".toUpperCase());
            break;
            case "spider-man":
                System.out.println("peter parker".toUpperCase());
                break;
            case "bat-man":
                System.out.println("Bruce Wayne".toUpperCase());
                break;
            case "super-man":
                System.out.println("clark kent".toUpperCase());
                break;
            case "captain america":
                System.out.println("steve rogers".toUpperCase());
                break;
            case "hulk":
                System.out.println("bruse banner".toUpperCase());
                break;
        }

    }
    public static void main(String[] args){
        IdentityChecker i = new IdentityChecker();
        i.exposeIdentity();
    }


}
