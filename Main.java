
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
            return x.elementAt(n-1);
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
                switch(i){
                    case 1:
                        if(!A.isEmpty()&&A.peek()==1){
                            int n = A.pop();
                            C.push(n);
                            PrintS(A,B,C);
                        }
                        else if(!B.isEmpty()&&B.peek()==1){
                            int n = B.pop();
                            A.push(n);
                            PrintS(A,B,C);
                        }
                        else if(!C.isEmpty()&&C.peek()==1){
                            int n = C.pop();
                            B.push(n);
                            PrintS(A,B,C);
                        }
                    case 2:
                        if(!A.isEmpty()&&A.peek()==2){
                            if(B.isEmpty()||B.peek()==3){
                                int n = A.pop();
                                B.push(n);
                                PrintS(A,B,C);
                            }
                        }
                        else if(!B.isEmpty()&&B.peek()==2){
                            if(C.isEmpty()||C.peek()==3){
                                int n = B.pop();
                                C.push(n);
                                PrintS(A,B,C);
                            }
                        }
                    case 3:
                        if(!A.isEmpty()&&A.peek()==3){
                            if(C.isEmpty()){
                                int n = A.pop();
                                C.push(n);
                                PrintS(A,B,C);
                            }
                        }
                }
            }
        }
    }
}
