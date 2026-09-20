package array.tasks;

public class FindVowels {
    public static void main(String [] args){
        String [] name = {"i","r","o","n","m","a","n"};
        String []arr = {"a","e","i","o","u"};
        for(int i=0;i<=arr.length-1;i++){
            for(int j=0 ;j<=name.length-1;j++){
                if(name[j]==arr[i]){
                    System.out.println(name[j]);
                }
            }
        }
    }
}