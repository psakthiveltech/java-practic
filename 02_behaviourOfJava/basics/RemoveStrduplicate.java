package behaviourOfJava.basics;

public class RemoveStrduplicate {
    public static void main(String [] args){
        String s = "vallavan";
        String val ="";
       for(int i=0;i<s.length();i++){
           char c = s.charAt(i);
           if(!val.contains(""+c)){
               val+=c;
           }
       }
        System.out.println(val);
    }

}
