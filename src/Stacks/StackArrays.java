package Stacks;

public class StackArrays {
    int[] arr;
    int topOfStack;

    public StackArrays(int size) {
        this.arr = new int[size];
        this.topOfStack = -1;
        System.out.println("The stack is created with a size of: " + size);
    }

    // Check if it is empty
    public boolean isEmpty() {
        return topOfStack == -1;
    }

    // Check if stack is Full
    public boolean isFull() {
        return topOfStack == arr.length - 1;
    }

    // Implement a push method
    public void push(int value) {
        if (isFull()) {
            System.out.println("The stack is full");
        } else {
            arr[++topOfStack] = value;
            System.out.println("The value is successfully inserted");
        }
    }

    // Implement pop method
    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return arr[topOfStack--];
    }

    // Implement peek method
    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return arr[topOfStack];
    }

    // Implement delete a stack
    public void delete() {
        arr = null;
    }

    // Use the stack data structure to check whether a word is a palindrome or not
    public static boolean isPalindrome(String word) {
        StackArrays stack = new StackArrays(word.length());
        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append((char) stack.pop());
        }

        return word.equals(reversed.toString());
    }

    // Implement a stack data structure using LinkedList instead of Arrays
    public static class LinkedListStack {
        private static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
            }
        }

        private Node top;

        public boolean isEmpty() {
            return top == null;
        }

        public void push(int value) {
            Node newNode = new Node(value);
            newNode.next = top;
            top = newNode;
            System.out.println("The value is successfully inserted");
        }

        public int pop() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            int value = top.data;
            top = top.next;
            return value;
        }

        public int peek() {
            if (isEmpty()) {
                throw new RuntimeException("Stack is empty");
            }
            return top.data;
        }

        public void delete() {
            top = null;
        }
    }
}

