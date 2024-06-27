public class find {

    public static int first (int arr [] , int n, int x  ){
        int l =0;
        int h =n-1;

        int ans = n;

        while(l<=h){
            int mid = l+h/2;

            if(arr[mid] >=x ){
                ans = mid ;
                h = mid -1;
            }
            else{
                l= mid+1;
            }

        }

        if( arr[ans ]!=x){
            ans = n;
        }

         else if (ans==n){
            return n;
        }
        return ans ;
    }
    public static int last  (int arr [] , int n, int x  ){
        int l =0;
        int h =n-1;

        int ans = n;

        while(l<=h){
            int mid = l+h/2;

            if(arr[mid] >x ){
                ans = mid ;
                h = mid -1;
            }
            else{
                l= mid+1;
            }

        }
      return ans ;
       
    }

    public static  int [] ansArr(int arr [], int n , int x ){



        int result [] = new int [2];

        result[0] = first( arr, n, x);
        result [1]=last(arr, n, x);

        return result;


        
    }

    




    public static void main(String[] args) {
        
        int arr [] = {1,2,2,4,4,4};
        int n = arr.length;
        int x = 4;
        ansArr(arr, n, x);

      System.out.println(ansArr(arr, n, x));


    

        
        

        
    
        
        
    }
    
}
