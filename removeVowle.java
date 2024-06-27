public class removeVowle {
    public static void main(String[] args) {
        
        String str = "Gaurav";

        for(int i = 0 ; i< str.length() ; i++){
            char ch = str.charAt(i);
            if(ch =='a' || ch == 'e' || ch=='i' || ch=='o' || ch=='u'){
                str = str.substring(0,i)+ str.substring(i+1);

                i--;
            }
        }
        System.out.println(str);
    }
    
}
