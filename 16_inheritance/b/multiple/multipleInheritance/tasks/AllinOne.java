package inheritance.b.multiple.multipleInheritance.tasks;

public class AllinOne implements Readable,Storable,Writeable{
    public void read(){
        System.out.println("readed");
    }
    public void write(){
        System.out.println("writable");
    }
    public void store(){
        System.out.println("storable");
    }
    public static void main(String[] args){
        AllinOne a = new AllinOne();
        a.read();
        a.write();
        a.store();
    }

}
