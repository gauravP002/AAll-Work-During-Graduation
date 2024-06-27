public class educa {
    public static void main(String[] args) {
        
        StringBuilder str = new StringBuilder("i am gaurav");
        
        str.reverse();

        int n = str.length();



        String ans ="";
        StringBuilder sb = new StringBuilder("");

        for (int i =0 ; i<n ; i++){
            char ch = str.charAt(i);
            if(ch!=' '){
                sb.append(ch);

            }
            else{
                sb.reverse();
                ans+=sb;
                ans+=" ";
               sb.delete(0, n);

            }

        }
        sb.append(" ");
        sb.reverse();
        ans+=sb;        

        System.out.println(ans);

    }
    
}
