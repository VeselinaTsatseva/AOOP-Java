package MyStack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        System.out.printf("is empty: %b\n", myStack.isEmpty());
        System.out.printf("Size: %d\n", myStack.size());
        System.out.printf("Peek: %s\n", myStack.peek());
        System.out.printf("Pop: %s\n", myStack.pop());


        myStack.push("test");
        System.out.println("Pushed 'test'");

        System.out.printf("is empty: %b\n", myStack.isEmpty());
        System.out.printf("Size: %d\n", myStack.size());
        System.out.printf("Peek: %s\n", myStack.peek());
        System.out.printf("Pop: %s\n", myStack.pop());
    }
}
