public class DecimalTobinary {


    public static int[] returnans (int n){


        int result [] = new int [32];

        int i =0;
        while(n>0){

            result[i] = n%2;
            i++;
            n/=2;
        }

        for(int j =i-1; j>=0 ;j--){

            result[j] = result[j];
        }

        return result;

        
    }
     public static void main(String[] args) {
         

        int n = 8;

        System.out.println();


     }
    
}
