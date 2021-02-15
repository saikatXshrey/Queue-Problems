import java.util.ArrayDeque;
import java.util.Queue;

class Stack {
    Queue<Integer> q1 = new ArrayDeque<>();
    Queue<Integer> q2 = new ArrayDeque<>();
    int size;

    Stack() {
        size = 0;
    }

    void push(int val) {
        size++;
        while (!q1.isEmpty()) {
            q2.offer(q1.poll());
        }
        q1.offer(val);
        while (!q2.isEmpty()) {
            q1.offer(q1.poll());
        }
    }

    void pop() {
        if (q1.isEmpty())
            return;
        q1.poll();
        size--;
    }

    int top() {
        if (q1.isEmpty())
            return -1;
        return q1.peek();
    }

    int size() {
        return size;
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(5);
        s.push(15);
        s.push(20);

        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());

        System.out.println("current size: " + s.size());
    }
}