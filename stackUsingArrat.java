class stack {

    int top = -1;
    int n = 10;
    int stc [] = new int[n];

    public void push(int m){
        if(top==n-1){
            System.out.println("stack is overflow");
        }

        else{
            top = top+1;
            stc[top] = m;
            System.out.print("number is inserted  :");
            System.out.println(stc[top]);
        }
    }

    public void  pop (){
        if(top ==-1){
            System.out.println("stack is underflow");
                
            }
            else{
                top = top-1;
                System.out.println("number is poped");
            }
            
           
        }

        public void peek(){
            System.out.println(stc[top]);
        }

        public void disp(){
            System.out.println("number is displayed ");
            for(int i =top ; i>=0 ; i--){
                System.out.println(stc[i]);
            }
        }
    }




public class stackUsingArrat{
    public static void main(String[] args) {
        stack sc = new stack();
        sc.push(10);
        sc.push(15);
        sc.push(20);
        sc.peek();
        sc.disp();
        sc.pop();
        sc.peek();
        sc.disp();
        sc.push(89);
        
    }
}