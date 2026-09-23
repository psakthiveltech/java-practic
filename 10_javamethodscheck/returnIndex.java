package javamethodscheck;

public class returnIndex {
    public static void main(String[] args) {
        String s = "valimaim";
        String v = "a";
        int val=0;
        for(int i =0;i<v.length();i++){
            for(int j =0;j<s.length();j++){
                if(s.charAt(j)==v.charAt(i)){
                    val=j;
                    break;
                }

            }

        }
        System.out.println(val);
        System.out.println(v.charAt(0)==s.charAt(2));
    }
}