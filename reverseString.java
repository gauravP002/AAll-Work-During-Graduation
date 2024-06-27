import java.util.Stack;

public class reverseString{
    public static void main(String[] args) {
        

        String str = "Gaurav";
        int n = str.length();

        char ch [] = new char[str.length()];

        Stack <Character> st1 = new Stack<>();

        for(int i=0; i<n; i++){
            st1.push(str.charAt(i));
        }

        int i =0; 
        while(!st1.empty()){
            ch[i++] =st1.peek();
            st1.pop();
        }

        str = new String(ch);
        System.out.println(str);
    }
}