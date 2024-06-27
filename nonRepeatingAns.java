import java.util.HashMap;
import java.util.Map;

public class nonRepeatingAns {

    public static String ansNum(String input){

        Map<Character ,Boolean> mp = new HashMap<>();

        StringBuilder sb = new StringBuilder("") ;

        for(int i =0 ;i<input.length() ;i++){
            if(!mp.containsKey(input.charAt(i))){
              sb.append(input.charAt(i));
              mp.put(input.charAt(i), true);

            }
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        
        String input = "gaurav pandey";

        String ans = ansNum(input);
        System.out.println(ans);


    }
    
}
