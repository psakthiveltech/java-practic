package array.tasks;

import java.util.Scanner;

public class TenthMarkPersentageFinder {
   public static void main(String[] args) {
       Scanner s= new Scanner(System.in);
       int[] marks = new int[5];
       for(int i=0;i<marks.length;i++){
           System.out.println( "Enter Your "+(i+1)+" mark :");

           marks[i]=s.nextInt();   
       }
       s.close();
       int total=0;
       for(int i:marks){
           total+=i;
       }
       System.out.println("Your Total Marks : "+total);
       System.out.println(",Your percentage is : "+(total/marks.length) +"%");
       if(total>=450){
           System.out.println("you passed with O+");
       } else if (total>=350&&total<=449) {
           System.out.println("You passed with A ");
       }
       else if (total>=250&&total<=349) {
           System.out.println("You passed with b ");
       }
       else if(total>=150&&total>=249){
           System.out.println("You passed with c ");
       }
       else{
           System.out.println("Try again");
       }

   }
}