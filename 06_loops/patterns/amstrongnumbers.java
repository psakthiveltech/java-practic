package loops.forloop.patterns;

public class amstrongnumbers {

    public static boolean amsnumber(long n){
         long result=0;
         long b=n;
         String l=n+"";
         while(n>0){
             long lv = n%10;
             long mul=1;
             for(int i =1;i<=l.length();i++){
                 mul=mul*lv;
             }
             result=result+mul;
             n=n/10;
         }

        System.out.println(result+" "+ b );
         if(result==b ){
             return true;
         }

         return false;
    }
    public static void main(String []arts){
        System.out.print(amsnumber(153));
    }
}