package myStack;

public class ArrayStackTester {
    public static void main(String[] args) {


        ArrayStack arrayStack = new ArrayStack<>();
        arrayStack.push(5);
        arrayStack.push(8);
        arrayStack.push(7);
        arrayStack.push(6);
        System.out.println("The top entry is: " + arrayStack.peek());
        System.out.println("The second entry is: "+arrayStack.peek2());
        System.out.println("The third entry is: " + arrayStack.peek3());

    }
}