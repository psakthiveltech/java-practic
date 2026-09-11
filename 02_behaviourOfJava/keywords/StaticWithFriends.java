package behaviourOfJava.keywords;

public class StaticWithFriends {
   static int friendCount = 0;  // if you use like this int friendcount ; it belongs to class so it not update any value.

    static void main(String[] args) {
        StaticWithFriends friend1 = new StaticWithFriends();
        friend1.friendCount+=1;
        StaticWithFriends friend2 = new StaticWithFriends();
        friend2.friendCount+=1;
//        System.out.println(friend1.friendCount);
//        System.out.println(friend2.friendCount);
        System.out.println(StaticWithFriends.friendCount);
    }
}