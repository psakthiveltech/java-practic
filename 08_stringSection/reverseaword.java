package stringSection;

import java.util.Scanner;

public class reverseaword {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String result ="";
//   String name = "klafjklfjadskl";

        for(int i=name.length()-1;i>=0;i--){
            result+=name.charAt(i);
        }
        System.out.println(result);
    }
}
