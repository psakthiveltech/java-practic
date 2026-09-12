package scannerMethods;
import java.util.Scanner;
public class NumberValidation {
    Scanner st = new Scanner(System.in);
    public void checkNum(){
        System.out.println("Enter ur number : ");
        String num = st.nextLine();

        switch(num.length()){
            case 0  :
                System.out.println("u type nothing");
                break;

            case 10:
                System.out.println("Valid number done...");
                break;
            case 9:
                System.out.println("one number is missing u typed 9 nums only");
                break;
            case 8:
                System.out.println("two number is missing u typed 8 nums only");
                break;
            case 7:
                System.out.println("seven number is missing u typed 7 nums only");
                break;
            case 6:
                System.out.println("six number is missing u typed 6 nums only");
                break;
            case 5:
                System.out.println("five number is missing u typed 5 nums only");
                break;
            case 4:
                System.out.println("four number is missing u typed 4 nums only");
                break;
            case 3:
                System.out.println("three number is missing u typed 3 nums only");
                break;
            case 2:
                System.out.println("two number is missing u typed 2 nums only");
                break;
            case 1:
                System.out.println("one number is missing u typed 1 nums only");
                break;
            default:
                System.out.println("u type more : 4" +num.length());
        }

    }
    public static void main(String[] args){
        NumberValidation n = new NumberValidation();
        n.checkNum();
    }

}
