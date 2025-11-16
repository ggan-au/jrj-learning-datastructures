package ds.stack;

public class Stack<T> {

    private int maxSize;
    private T[] stackArray;
    private int top;

    @SuppressWarnings("unchecked")
    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = (T[]) new Object[maxSize];
        this.top = -1;
    }

    public void push(T j) {
        if (isFull()) {
            throw new IndexOutOfBoundsException("Stack size limit reached: Stack max size: " + maxSize);
        } else {
            top++;
            stackArray[top] = j;
        }
    }

    public T pop() {
        if (isEmpty()) {
            throw new IndexOutOfBoundsException("Stack is empty: Stack max size: " + maxSize);
        } else {
            int oldTop = top;
            top--;
            return stackArray[oldTop];
        }
    }

    public T peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return maxSize-1 == top;
    }
}
