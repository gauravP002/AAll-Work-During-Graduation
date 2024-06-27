public class firstAndLanst {
    public static void main(String[] args) {
        
        String str = "take you forword";

        int n =str.length();
        StringBuilder sb = new StringBuilder();

        

        
        for(int i =0 ; i<n; i++){

            char ch = str.charAt(i);
            int index = (int) ch;
            if(i== 0 || i==n-1){
                if(index >=97){

                    index-=32;
                    char ch1 =(char)index;
                    sb.append(ch1);


                    
                }
                else{

                }
            }

                if(ch==' '){
                    char ch2 = str.charAt(i-1);
                    char ch3 = str.charAt(i+1);
                     index= (int) ch2;
                  int   index2=(int) ch3;
                      if(index>=97 || index >=97){

                    index-=32;
                    index2-=32;
                    char ch4 =(char)index;
                    char ch5 =(char)index2;
                    sb.append(ch4);
                    sb.append(ch5);


                    
                }
               


                }
                sb.append(ch);
            



        }
       
        System.out.println(sb);
    }
    
}
