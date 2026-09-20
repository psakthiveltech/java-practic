package array.tasks;

import java.util.Scanner;

public class InputMark {
    public void markCalculator(){
        Scanner sc = new Scanner(System.in);
        String [] name =new String[2];
        for(int  i = 0; i<=name.length-1;i++){
            System.out.println("Enter u r favirout heros");
            String s = sc.nextLine();
            name[0]=s;
        }
        for(String i : name){
            System.out.println(i);
        }

    }
    public static void main(String[] args){
        InputMark m = new InputMark();
        m.markCalculator();
    }
}
