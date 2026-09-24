package objectallPratice.basics;

public class King {
    int age;
    String name;

    public static void main (String[] args){
      King king = new King();
      King son = king;
      king.name = "maharaj";
      son.name="child";
      System.out.print(king.name);
      king = new King();//int a = 10 / in order to change like this  a = 12;
    }
}