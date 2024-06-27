public class reverswordwithout {

    public static void main(String[] args) {
        String str = "you are villen";
        int n = str.length();

        String ans = " ";

      StringBuilder sb = new StringBuilder();


        for(int i =0; i<n ; i++){
            char ch = str.charAt(i);
            if(ch != ' '){
                sb.append(ch);
         

            }
            else{
                sb.reverse();
         
                ans+= sb.toString();
        sb.deleteCharAt(0);
           
   
            }
           
        }
        sb.reverse();
         ans+=sb;
         System.out.println("ans is ");
          
            System.out.println(ans);
    }
    
}
