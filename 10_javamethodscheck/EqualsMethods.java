package javamethodscheck;

import java.util.Scanner;

public class EqualsMethods {
    static void main(String[] args) {
        String s = "sakthivelp";
        Scanner st = new Scanner(System.in);
        String v =st.nextLine();
        if(s.equals(v)){
            System.out.println("its true");
        }
        else{
            System.out.println("it was false");
        }
    }
}
