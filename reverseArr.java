public class reverseArr {
    public static void main(String[] args) {
        
        String str = "I am gaurav pandey";

        int left =0;
        int right = str.length()-1;

        String  temp ="";
        String ans = "";

        while(left<=right){
            char ch = str.charAt(left);

            if(ch !=' '){
                temp+=ch;
            }
            else if (ch ==' '){

                if(ans != ""){
                    ans = temp +" " +ans;
                }
                else{
                    ans = temp;

                }
                temp ="";
            }

            left++;
            }
        
            if(!temp.equals("")){

                if(!ans.equals("")){

                    ans = temp + " " +ans;
                }
                else{
                    ans = temp;
                }

            }
            System.out.println(ans);

        }


    }
    

