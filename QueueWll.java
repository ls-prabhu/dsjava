import java.util.*;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueWll {
    private Node front, rear;

    public QueueWll() {
        this.front = this.rear = null;
    }

    // Enqueue operation
    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (this.rear == null) {
            this.front = this.rear = newNode;
            return;
        }

        this.rear.next = newNode;
        this.rear = newNode;
    }

    // Dequeue operation
    public void dequeue() {
        if (this.front == null) {
            System.out.println("Queue is empty");
            return;
        }

        System.out.println("Elements removed after Deletion:");
        System.out.println("********************************");
        Node temp = this.front;
        this.front = this.front.next;

        if (this.front == null) {
            this.rear = null;
        }

        System.out.println(temp.data);
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return this.front == null;
    }

    // Display queue elements
    public void display() {
        if (this.front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node current = front;
        System.out.println("Elements in Queue:");
        System.out.println("*****************");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        QueueWll queue = new QueueWll();
        Scanner sc = new Scanner(System.in);

        System.out.println("Queue implementation using linked list");
        System.out.println("******************************");

        while (true) {
            System.out.println("1. ENQUEUE");
            System.out.println("2. DEQUEUE");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter value to add to Queue:");
                    int value = sc.nextInt();
                    queue.enqueue(value);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.display();
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
