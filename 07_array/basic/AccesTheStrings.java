package array.basic;

public class AccesTheStrings {
    public static void main(String[] args){
        String [] names ={"one","two","three","four","five","six","seven","eight","nine","ten"};
        names[2]="three  ;-)  3";
        System.out.println(names[3]);
        System.out.println(names[8]);
        System.out.println(names.length);
        System.out.println(names[6]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
