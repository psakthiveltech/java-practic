package objectallPratice.basics;

import java.util.Scanner;

public class basicMathematics {
    Scanner s = new Scanner(System.in);

    void add(int a,int b){
        System.out.println("the sum of number is : "+(a+b));
    }

    void sub(int a,int b){
        System.out.println("the subtraction of number is : "+(a-b));
    }

    void mul(int a,int b){
        System.out.println("the multiplecation of number is : "+(a*b));
    }

    void div(int a ,int b){
        System.out.println("the division of number is : "+(a/b));
    }
    public static void main(String[]args){
        basicMathematics stu1 = new basicMathematics();

        stu1.add(10,20);
        stu1.sub(10,20);
        stu1.mul(10,20);
        stu1.div(10,20);
    }
}
