import java.util.ArrayList;

public class union {

    public static   ArrayList<Integer> unionOf(int arr1[] , int arr2[] ,int m, int n  , ArrayList<Integer> list ){
        int i =0;
        int j =0;
         
        
       
        while (i<m  && j<n) {

            if(arr1[i]<=arr2[j]){

                if( list.size()==0 || list.get( list.size()-1) !=arr1[i] ){

                    list.add(arr1[i]);
                }
                i++;
                System.out.println( "size is "+list.size());

            }
            

            else{

                 if( list.size()==0 || list.get( list.size()-1) !=arr2[j] ){

                    list.add(arr2[j]);
                }
                j++;

            }

        }
         while(i<m){
                                
                if( list.isEmpty() || list.get( list.size()-1) !=arr1[i] ){
                    list.add(arr1[i]);
                }
                i++;

            }

        
        while(j<n){
               if( list.size() ==0 || list.get( list.size()-1) !=arr2[j] ){

                    list.add(arr2[j]);
                }
                j++;

        }
        return list;

            
        }

    
          public static   ArrayList<Integer> intersection(int arr1[] , int arr2[] ,int m, int n  , ArrayList<Integer> list ){
        int i =0;
        int j =0;
        while (i<m && i<n){
            if(arr1[i] <arr2[j]){
                i++;
            }
            else if(arr2[j] <arr2[i]){
                j++;
            }
            else{
                list.add(arr1[i]);
                i++;
                j++;
            }

        }
        return list;
          }
    

    public static void main(String[] args) {
        
        int arr1 [] = {1,2, 2,3,4,5,6};
        int arr2  []= {1,2,2,2,3,4,5,6,7};

        int m = arr1.length;
        int n = arr2.length;

        ArrayList<Integer> list = new ArrayList<>();
       
        

       
        // unionOf(arr1, arr2, m, n , list);
        // System.out.println(  " UNION OF TWO ARRAY IS :" +list);
        //  System.out.println(list.get(3));
        // System.out.println( list.size());
        intersection(arr1, arr2, m, n, list);
        System.out.println(list);

    }
}