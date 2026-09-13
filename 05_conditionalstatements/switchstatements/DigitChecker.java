package conditionalstatements.switchstatements;
import java.util.Scanner;
public class DigitChecker {
    public void Digitcheckerswitch(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your amout in alphabets");
        String digits = s.nextLine();
        switch(digits){
            case "one":
                System.out.println("one = 1");
                break;
            case "ten":
                System.out.println("ten = 10");
                break;
            case "hundred":
                System.out.println("hundred = 100");
                break;
            case "thousand":
                System.out.println("thousand = 1000");
                break;
            case "ten thousand":
                System.out.println("ten thousand = 10000");
                break;
            case "lack":
                System.out.println("lack = 100000");
                break;
            case "ten lack":
                System.out.println("ten lack= 10000000");
                break;
            case "crore":
                System.out.println("crore = 10000000");
                break;
            default:
                System.out.println("enter any valid amount name in english");
        }

    }
    public static void main(String[] args){
        DigitChecker d = new DigitChecker();
        d.Digitcheckerswitch();
    }
}