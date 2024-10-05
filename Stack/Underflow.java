import java.io.*;
import java.util.Stack;

public class Underflow {
    public static void main(String[] args) throws IOException {
        // 라이브러리 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<>();

        // 변수 생성
        System.out.print("Stack picks : ");
        int Stack_size = Integer.parseInt(br.readLine());
        int Stack_number = 0;

        // 예외 처리
        try{
            for(int i = 0; i < Stack_size; i++){
                System.out.print("Push(1) or Pop(2) : ");
                int number = Integer.parseInt(br.readLine());
                if(number == 1) {
                    System.out.print("Stack Push number : ");
                    Stack_number = Integer.parseInt(br.readLine());
                    stack.push(Stack_number);
                }else {
                    stack.pop();
                }
            }
        }catch (StackOverflowError e){
            System.out.println("Stack Overflow");
        }catch (Exception e){
            System.out.println("Stack Underflow");
        }
    }
}
