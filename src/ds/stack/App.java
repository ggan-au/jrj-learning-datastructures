package ds.stack;

public class App {

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
        System.out.println("==============================");
        Stack<Long> theStack = new Stack<Long>(4);
        try {
            theStack.push(100L);
            theStack.push(101L);
            theStack.push(102L);
            theStack.push(103L);
            theStack.push(104L);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Hit here");
            System.out.println(e.getMessage());
        }

        while (!theStack.isEmpty()) {
            long value = theStack.pop();
            System.out.println(value);
        }
    }

    public static String reverseString(String word) {
        StringBuilder reversedWord = new StringBuilder();

        Stack<Character> stack = new Stack<>(word.length());
        for (char ch : word.toCharArray()) {
            stack.push(ch);
        }

        while (!stack.isEmpty()) {
            reversedWord.append((char) stack.pop());
        }

        return reversedWord.toString();
    }
}
