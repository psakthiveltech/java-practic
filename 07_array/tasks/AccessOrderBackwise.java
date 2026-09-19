package array.tasks;

public class AccessOrderBackwise {
    public static void main(String[] args){
        String[] heroes = {"Iron Man", "Spider-Man", "Batman", "Superman"};
        for(int i=heroes.length-1;i>=0;i--){
            System.out.println(heroes[i]);
        }
    }
}