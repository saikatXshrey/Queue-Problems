class Node {
    int key;
    Node next;

    public Node(int key) {
        this.key = key;
        this.next = null;
    }
}

class Queue {
    Node front;
    Node rear;

    public Queue() {
        this.front = this.rear = null;
    }

    void enqueue(int val) {
        Node temp = new Node(val);

        if (this.rear == null) {
            this.rear = this.front = temp;
            return;
        }

        this.rear.next = temp;
        this.rear = temp;
    }

    void dequeue() {
        if (this.front == null)
            return;

        this.front = this.front.next;

        if (this.front == null)
            this.rear = null;
    }
}

class Driver {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        System.out.println("Queue Front : " + q.front.key);
        System.out.println("Queue Rear : " + q.rear.key);
    }
}