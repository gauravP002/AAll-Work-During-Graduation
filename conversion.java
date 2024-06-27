public class conversion {
    public static void main(String[] args) {
        
        String str = "Gaurav pandey";
        StringBuilder sb = new StringBuilder(str);

        int n = str.length();
        for(int i =0 ; i<n ;i++){
            char ch = str.charAt(i);

            int index = (int)ch;

            if(index >=65 && index <=90){
                index+=32;
                char chr = (char) index;
             sb.setCharAt(i, chr);


            }
             else{
                index-=32;
                char chr = (char) index;
              sb.setCharAt(i, chr);


            }
        }
        System.out.println(sb);
    }
    
}
