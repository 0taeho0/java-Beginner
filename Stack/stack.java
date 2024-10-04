import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        // Stack, BufferReader 라이브러리 생성
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Stack의 maxSize
        System.out.print("Stack max Size : ");
        int maxSize = Integer.parseInt(br.readLine());

        // 오버플로우(Overflow) 확인
        try{
            for(int i = 1; i < maxSize + 1; i++){
                if(i > maxSize) System.out.println("Stack overflow");
                System.out.print("Stack push number : ");
                stack.push(Integer.parseInt(br.readLine()));
            }
        }catch (StackOverflowError stackError){
            System.out.println("Stack overflow 발생");
        }
        System.out.println("Stack : " + stack);
    }
}
