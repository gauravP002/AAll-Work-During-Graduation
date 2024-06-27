public class caseChange {
    public static void main(String[] args) {
        
        String str ="My name is GAurav Pandey ";

        String ans = "";

        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);

            int asci = (int) ch;

            if(asci>=65 && asci<=90){
                asci+=32;

                char dh = (char)asci;

                ans+=dh;
                
                
            }
            else  if(asci>=90 && asci<=122){
                asci-=32;
                char bh = (char)asci;
                ans+=bh;
                
                
            }
            else if(asci==' '){
                ans+=' ';
            }
        }
        System.out.println(ans);
    }
    
}
