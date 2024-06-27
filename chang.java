public class chang {
    public static void main(String[] args) {
        
        String sc = "my name is gaurav i Am From sAtna";

        StringBuilder sb = new StringBuilder("");

        for(int i =0; i<sc.length() ; i++){
            char ch = sc.charAt(i);

            int asci = (int) ch;
            if(asci>=65 && asci<=90){

                sb.append((char) (asci+32));
            }

            else if(asci>=97 && asci <=122){
                sb.append((char) (asci-32));
            }

            else if(ch ==' ' ){
                sb.append(' ');
            }

            
        }
        System.out.println(sb);

    }
    
}
