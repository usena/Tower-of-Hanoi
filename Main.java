import java.util.Stack;
public class Main {
    public static void PrintS(Stack<Integer> A, Stack<Integer> B, Stack<Integer> C){
        System.out.println(String.valueOf(popStack(A,3))+String.valueOf(popStack(B,3))+String.valueOf(popStack(C,3)));
        System.out.println(String.valueOf(popStack(A,2))+String.valueOf(popStack(B,2))+String.valueOf(popStack(C,2)));
        System.out.println(String.valueOf(popStack(A,1))+String.valueOf(popStack(B,1))+String.valueOf(popStack(C,1)));
        System.out.println("___");
    }
    public static Object popStack(Stack<Integer> x,int n){
        if(x.size()<n){
            return 0;
        }
        else{
            return x.pop();
        }
    }
    public static void main(String[] args) {
        Stack<Integer> A = new Stack<>();
        Stack<Integer> B = new Stack<>();
        Stack<Integer> C = new Stack<>();

        for(int i=3;i>0;i--){
            A.push(i);
        }

        while(C.size()!=3){
            for(int i=1;i<4;i++){
                if(i==1){
                    if(A.peek()==1){
                        int n = Integer.valueOf(String.valueOf(A.pop()));
                        C.push(n);
                        PrintS(A,B,C);
                    }
                    else if(B.peek()==1){
                        int n = Integer.valueOf(String.valueOf(B.pop()));
                        A.push(n);
                        PrintS(A,B,C);
                    }
                    else if(C.peek()==1){
                        int n = Integer.valueOf(String.valueOf(C.pop()));
                        B.push(n);
                        PrintS(A,B,C);
                    }
                }
                else if(i==2){
                    if(A.peek()==2){
                        int n = Integer.valueOf(String.valueOf(A.pop()));
                        B.push(n);
                        PrintS(A,B,C);
                    }
                    else if(B.peek()==2){
                        int n = Integer.valueOf(String.valueOf(B.pop()));
                        C.push(n);
                        PrintS(A,B,C);
                    }
                }
                else if(i==3){
                    if(A.peek()==3){
                        int n = Integer.valueOf(String.valueOf(A.pop()));
                        C.push(n);
                        PrintS(A,B,C);
                    }
                }
            }
        }
    }
}