public class maxword {

    public static String ansNum(String str){

        String words [] = str.split(" ");

        String maxword = words[0];

        for(String word : words ){
            if(word.length() > maxword.length()){

                maxword = word;
            }
        }
        return maxword;

        
    }

    public static void main(String[] args) {
        
        String str = "My nameispatil is gaurav";

        String ans = ansNum(str);
        System.out.println(ans);


    }
    
}
