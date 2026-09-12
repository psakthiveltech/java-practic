package scannerMethods;

import java.util.Scanner;

public class HiStringMethods {
   public static  void  main(String[] args){
        Scanner scan  =  new Scanner(System.in);
        System.out.println("What is Your Name :");
        String name = scan.next();
        System.out.println(("What is your Age :"));
        int age = scan.nextInt();
       scan.nextLine();
       System.out.println("What is your Skill" );
       String skill = scan.nextLine();
       System.out.println("phNo");
       long numbers = scan.nextLong();
       System.out.println("How do You describe u r gender");
       String gender = scan.next();
       System.out.println("This is Your details did u agree ?");
       boolean stm = scan.nextBoolean();
       scan.close();
       System.out.println("Your name is  :" + name +System.lineSeparator()+"Your age is : " + age + System.lineSeparator()+"Your skill is :" + skill +System.lineSeparator()+" Your number is :" +numbers +System.lineSeparator()+" Your Gender is :" +gender +System.lineSeparator()+" Above statements are " + stm);
    }
}
