package behaviourOfJava.basics;

public class PassByValueReference {
    int length;
    PassByValueReference(int length){
        this.length=length;
    }

    static void vals(PassByValueReference val){
        val.length++;
    }

    static void main(String[] args) {
        PassByValueReference val = new PassByValueReference(10);
        System.out.println(val.length);
        vals(val);
        System.out.println(val.length);
    }

}
