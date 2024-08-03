package Stacks;

public class Main {
    public static void main(String[] args) {
        // Testing StackArrays with array-based implementation
        StackArrays stackArrays = new StackArrays(5);
        stackArrays.push(1);
        stackArrays.push(2);
        stackArrays.push(3);
        System.out.println("Peek: " + stackArrays.peek());
        System.out.println("Popped: " + stackArrays.pop());
        System.out.println("Is Empty: " + stackArrays.isEmpty());
        System.out.println("Is Full: " + stackArrays.isFull());

        // Testing palindrome check
        String word = "racecar";
        System.out.println("Is \"" + word + "\" a palindrome? " + StackArrays.isPalindrome(word));

        // Testing LinkedListStack
        StackArrays.LinkedListStack linkedListStack = new StackArrays.LinkedListStack();
        linkedListStack.push(1);
        linkedListStack.push(2);
        linkedListStack.push(3);
        System.out.println("Peek LinkedListStack: " + linkedListStack.peek());
        System.out.println("Popped LinkedListStack: " + linkedListStack.pop());
    }
}
