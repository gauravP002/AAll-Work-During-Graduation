import java.util.HashMap;





public class  tosum {
        public static int[] ans(int arr[] , int n  , int target){
        HashMap<Integer ,Integer> map = new HashMap<>();

        int result [] = new int[2];

        for(int i = 0; i<n; i++){
            map.put(arr[i], i);


    
        }
        

        for(int i =0; i<n; i++){
            if(arr[i] == target &&  map.containsKey(0) ){
                result[0] =i;
                result[1]= map.get(0);
                break;
            }

            if(map.containsKey(target-arr[i])){
                if(map.get(target-arr[i])>i){

                    result[0] = i;
                    result[1] = map.get(target-arr[i]);
                    break;

                }
            }
        }
        return result;

    }

    public static void main(String[] args) {
        
        int arr [] = {2,3,4,7,9 ,0};
        int n = arr.length;
        int target = 2;

     

      int result[]  =  ans(arr, n, target);

        System.out.println("[" +result[0]  +" ,"  +result[1] + "]");
    }
    
}
