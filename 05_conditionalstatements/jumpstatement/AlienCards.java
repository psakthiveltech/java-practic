package conditionalstatements.jumpstatement;

public class AlienCards {
    public static void main(String[] args){
        String[] alienCards = {"Swampfire", "Humungousaur", "Echo Echo", "Chromastone", "Big Chill", "Goop", "Brainstorm", "Alien X", "Lodestar", "Rath"};
        for(String card : alienCards){
            if(card=="Big Chill"){
                continue;
            }
            System.out.println(card);
        }
    }
}
