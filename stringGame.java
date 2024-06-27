import java.util.Arrays;

public class stringGame {

    public static int ans(int arr[]){

        if(arr.length <4){

            int ans = 0;
            for(int num: arr){
                ans+=num;
            }
            return ans;
        }

        Arrays.sort(arr);
        int n = arr.length;

        int vag = arr[n-1]+ arr[n-2] +arr[n-3] +arr[n-4];
        return vag;
    }
    public static void main(String[] args) {
        
        int arr [] ={0,0,2,3,7,1};
        int an =ans(arr);

        StringBuilder sb = new StringBuilder("");
        sb.append(an);
        sb.append("msq01hu389");

        for(int i =3; i<sb.length();i+=4){

            sb.setCharAt(i, '_');
           

        }
        System.out.println(sb);
    }
    
}
