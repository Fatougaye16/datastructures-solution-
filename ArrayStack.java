package myStack;

import java.lang.reflect.Array;
import java.util.Arrays;

import static sun.util.locale.LocaleUtils.isEmpty;

public class ArrayStack<T> {
    private T[] stack;
    private int topIndex;
    private static final int DEFAULT_INITIAL_CAPACITY = 50;

    public ArrayStack() {
        this(DEFAULT_INITIAL_CAPACITY);

    }

    public ArrayStack(int initialCapacity) {
        @SuppressWarnings("unchecked")
        T[] tempStack = (T[]) new Object[initialCapacity];
        stack = tempStack;
        topIndex = stack.length-1;
    }


    private void ensureCapacity() {
        if (topIndex == stack.length - 1) {
            stack = Arrays.copyOf(stack, 2 * stack.length);
        }
    }

    public void push(T newEntry) {
        ensureCapacity();
        topIndex++;
        stack[topIndex] = newEntry;

    }

    public T peek() {
        T top = null;
        if (!(stack == null))
            top = stack[topIndex];
        return top;

    }
    public T peek2(){
        T top = null;
        if (!(stack == null)){
            top = stack[topIndex - 1];
        }
        return top;
    }
    public T peek3(){
        T top = null;
        if (!(stack == null)){
            top = stack[topIndex - 2];
        }
        return top;
    }

    public T pop() {
        T top = null;
        if (!(stack == null)) {
            top = stack[topIndex];
            stack[topIndex] = null;
            topIndex--;
        }
        return top;
    }
    public void clear(){

        stack = null;
    }
}



