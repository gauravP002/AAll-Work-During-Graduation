public class decompressliat {

    public static int [] ansNum(int []  input){
        int n = input.length;
        int size = 0;


        for(int i = 0 ; i< n ; i=i+2){

            size = size+input[i];
            
        }

        int ansArr [] = new int [size];
        int j =0;

        for(int i =0 ;i<n ;i=i+2){
            int fre = input[i];
            int val = input[i+1];

            while (fre>0) {
                ansArr[j]=val;
                j++;

                
            }
        }
        return ansArr;
    }

    public static void main(String[] args) {
        
        int input [] = {1,1 ,2,3};

        int ans [] = ansNum(input);

        for(int i =0; i<ans.length ;i++){
            System.out.println(ans[i] +" ");
        }
    }
    
}
