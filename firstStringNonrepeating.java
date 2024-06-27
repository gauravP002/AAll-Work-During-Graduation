import java.util.*;

public class firstStringNonrepeating{

    public static char ansfun(String input){

        int n = input.length();
        char ah = 'a';

        Map<Character , Integer> mp = new HashMap<>();

        for(int i =0 ; i<n ;i++){

            char ch = input.charAt(i);
           if(mp.containsKey(ch)){
            mp.put(ch, mp.get(ch)+1);
           }
           else{
            mp.put(ch , 1);
           }

        }

        for(int i =0 ;i<n ;i++){
            char dh = input.charAt(i);

            if(mp.get(dh)==1){
               return dh ;
            }
        }
        return ah;
    
        
    }
    public static void main(String[] args) {
        

        String input = "gauurravvg";

        char ans = ansfun(input);
        System.out.println(ans );

    }
 }