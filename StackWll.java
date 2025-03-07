import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class StackWll {
    private Node top;

    public StackWll() {
        this.top = null;
    }

    // Push method
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    // Pop method
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            int poppedData = top.data;
            top = top.next;
            System.out.println("Popped element is: " + poppedData);
        }
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Display stack elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Elements in Stack:");
        System.out.println("**************************");
        Node current = top;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StackWll stack = new StackWll();
        System.out.println("Stack Implementation using Linked List");
        System.out.println("*******************************");

        while (true) {
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter value to push into stack:");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
