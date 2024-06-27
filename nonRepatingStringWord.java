import java.util.HashSet;
import java.util.Set;

public class nonRepatingStringWord{

    public static void main(String[] args) {
        

        String str = "aabbccdd";
        int n = str.length();


        Set<Character> set = new HashSet<>();

        StringBuilder sb = new StringBuilder("");

        for(int i =0; i<n ; i++){
            char c = str.charAt(i);

            if(!set.contains(c)){
                set.add(c);

                sb.append(c);
            }
        }

        System.out.println(sb);

            
        

    }

}