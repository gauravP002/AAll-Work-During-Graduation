public class lengthOflongest {
    public static int ans(int [] arr ){
        
  
    int longans =1;
    int curr =1;

    for(int i =1; i<arr.length; i++){
        if(arr[i] != arr[i-1]){
            if(arr[i] == arr[i-1]+1){
                curr++;
            }
            else{

                longans = Math.max(longans,curr);
                curr =1;

            }
        }

    }
    return Math.max(longans,curr);


    }
    public static void main(String[] args) {
        
        int arr [] = {1,2,4,12,8,9,103,104,105,106,107,109};
        int an = ans(arr);
        System.out.println(an);

        
    }
    
}
