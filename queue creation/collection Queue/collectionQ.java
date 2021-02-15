import java.util.ArrayDeque;
import java.util.Queue;

class queue {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(50);

        System.out.println(q.poll());
        System.out.println(q.size());
        System.out.println(q.isEmpty());
        System.out.println(q);
    }
}