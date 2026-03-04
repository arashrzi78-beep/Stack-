import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(10);
        // Random numbers
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            stack.push(rand.nextInt(11)+4);
        }
        // Print all stack
        Stack tempStack = new Stack(10);
        while (!stack.isEmpty()) {
            System.out.println(stack.peek());
            tempStack.push(stack.pop());
        }
        while(!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
        // Find the total of all elements in the stack
        int sum =0;
        while (!stack.isEmpty()) {
            tempStack.push(stack.pop());
        }
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }
        System.out.println(sum);

    }
}