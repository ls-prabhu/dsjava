import java.util.Scanner;

public class QueueWarr {
    private int front, rear, capacity;
    private int[] queue;

    public QueueWarr(int size) {
        front = rear = 0;
        capacity = size;
        queue = new int[capacity];
    }

    // Enqueue operation
    public void enqueue(int item) {
        if (capacity == rear) {
            System.out.println("Queue is full");
            return;
        } else {
            queue[rear] = item;
            rear++;
        }
    }

    // Dequeue operation
    public void dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        } else {
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            if (rear < capacity) {
                queue[rear - 1] = 0;
            }
            rear--;
        }
    }

    // Display operation
    public void display() {
        if (front == rear) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i < rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Queue size: ");
        int n = scanner.nextInt();
        QueueWarr q = new QueueWarr(n);

        while (true) {
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = scanner.nextInt();
                    q.enqueue(value);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
