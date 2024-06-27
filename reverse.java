import java.util.Stack;

public class reverse{
    public static void main(String[] args) {
        
        String name = "Rishabh Pandey";
        int n = name.length();
        Stack<Character> st = new Stack<>();
        StringBuilder sb = new StringBuilder("");

        for(int i =0; i<n; i++){
            st.push(name.charAt(i));

        }
        while(!st.isEmpty()){
            sb.append(st.peek());
            st.pop();
        }
        System.out.println(sb);


    }
}