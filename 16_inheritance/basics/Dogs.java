package inheritance.basics;

public class Dogs extends Animals{
    public Dogs(){
        System.out.println("dog will run before or after we will find ");
    }
    void bark(){
        System.out.println("voll voll ha ha ha ...");
    }
    public static void main(String[] args){
        Dogs d = new Dogs();
    }

}
