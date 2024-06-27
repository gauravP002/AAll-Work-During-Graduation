import java.util.HashMap;

public class firstNon {

    public static int ans(String str , int n){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i =0;i<str.length();i++){
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            }
            else{
                map.put(str.charAt(i), 1);
            }

           
        }

        int result =-1;

        for(int i =0; i<n; i++){
            if(map.get(str.charAt(i))==1){
                return i;
              
            }

          
        }
        return -1;

    }

    public static void main(String[] args) {
        
        String str = "aurav";

        int n = str.length();

        int ans = firstNon.ans(str, n);
        System.out.println(ans);

    }
    
}
