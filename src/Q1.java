public class Q1 {
    public static void main(String[] args) {
        Queue<Integer> hooo = new Queue<>();
        hooo.insert(1);
        hooo.insert(2);
        hooo.insert(3);
        hooo.insert(2);
        hooo.insert(1);
        hooo.insert(2);
        enter(hooo);
    }

    public static void enter(Queue<Integer> queue) {
        Queue<Integer> back = new Queue<>();
        back.insert(queue.remove());
        while (!queue.isEmpty()) {
                while (queue.head() < back.head()) {
                    back.insert(queue.remove());
                }
                if (queue.head() > back.head()) {
                    back.insert(queue.head());
                }

                while (!queue.isEmpty() && queue.head() > back.head()) {
                    back.insert(queue.remove());
                }
                back.insert(back.head());
            }
        queue=back;
        System.out.printf(queue.toString());
    }
}

