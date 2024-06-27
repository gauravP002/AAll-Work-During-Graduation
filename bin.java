import java.util.Scanner;

public class bin{


    public static int fun (String input){

        int base = 1;
        int ans = 0;

        for(int i =input.length()-1 ; i>=0 ; i--){

     if(input.charAt(i) == '1'){

        ans +=base ;
     }

     base *=2;
        }

        return ans ;

    }
    public static void main(String [] args){

     Scanner sc = new Scanner(System.in);
     System.out.println("enter input string ");

     String  input = sc.nextLine();
     int result = fun(input);
     System.out.println(result);

        



    }
}