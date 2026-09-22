package methods;
import java.util.Scanner;
public class PassorFail {
    Scanner s = new Scanner(System.in);
   public String PassorFailTeller(){
       System.out.println("Enter how many subjects u have");
       int subsize = s.nextInt();
       System.out.println("Enter how many marks u written");
       int outof = s.nextInt();
       int total = 0;
       int[] val = new int[subsize];
       for(int i = 0; i<=subsize-1;i++){
           System.out.println("Enter your mark " +(i+1));
           val[i]=s.nextInt();
       }
       s.close();
       for(int i:val){
           total+=i;
       }
       if(total>=(subsize*outof)/2){
           System.out.println( " total is  " +total);
           return  "Pass";
       }
       else{
           System.out.println( " total is  " +total);
           return " Fail";
       }


   }
    public static void main(String [] args){
        PassorFail pof = new PassorFail();
        String result =  pof.PassorFailTeller();
        System.out.println(result);

    }
}
