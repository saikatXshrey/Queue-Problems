import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

class revQue {
    static Queue<Integer> q;

    static void print() {
        for (int i : q)
            System.out.print(i + " ");
    }

    static void rev() {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        while (!q.isEmpty()) {
            stack.push(q.peek());
            q.remove();
        }
        while (!stack.isEmpty()) {
            q.add(stack.peek());
            stack.pop();
        }
    }

    public static void main(String[] args) {
        q = new LinkedList<>();
        q.add(12);
        q.add(5);
        q.add(15);
        q.add(20);

        rev();
        print();
    }
}