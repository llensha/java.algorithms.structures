package lesson3.homework3;

import lesson3.myqueue.PriorityQueue;
import lesson3.myqueue.Queue;
import lesson3.myqueue.QueueImpl;
import lesson3.mystack.Stack;
import lesson3.mystack.StackImpl;

public class CheckLesson3 {

    public static void main(String[] args) {

        System.out.println("Check stack");
        checkStack();

        System.out.println("\nCheck queue");
        checkQueue();

        System.out.println("\nCheck priority queue");
        checkPriorityQueue();
    }


    private static void checkStack() {

        Stack<Integer> stack = createAndPushStack(1,3,5,7,9,2,4,6,8,0);

        System.out.println("Stack size: " + stack.size());
        System.out.println("Stack top: " + stack.peek());
        System.out.print("Stack: ");
        extractStack(stack);
    }

    private static Stack<Integer> createAndPushStack(int... values) {
        int maxSize = getMaxSize(values);

        Stack<Integer> stack = new StackImpl<>(maxSize);
        for (int value : values) {
            stack.push(value);
        }
        return stack;
    }

    private static void extractStack(Stack<Integer> stack) {
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    private static void checkQueue() {
        Queue<Integer> queue = createAndInsertQueue(1,3,5,7,9,2,4,6,8,0);

        System.out.println("Queue size: " + queue.size());
        System.out.println("Queue head: " + queue.peekHead());
        System.out.print("Queue: ");
        extractQueue(queue);
    }

    private static Queue<Integer> createAndInsertQueue(int... values) {
        int maxSize = getMaxSize(values);

        Queue<Integer> queue = new QueueImpl<>(maxSize);
        for (int value : values) {
            queue.insert(value);
        }
        return queue;
    }

    private static void extractQueue(Queue<Integer> queue) {
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println();
    }

    private static void checkPriorityQueue() {
        PriorityQueue<Integer> queue = createAndInsertPriorityQueue(1,3,5,7,9,2,4,6,8,0);

        System.out.println("Priority Queue size: " + queue.size());
        System.out.println("Priority Queue head: " + queue.peekHead());
        System.out.print("Priority Queue: ");
        extractQueue(queue);
    }

    private static PriorityQueue<Integer> createAndInsertPriorityQueue(int... values) {
        int maxSize = getMaxSize(values);

        PriorityQueue<Integer> queue = new PriorityQueue<>(maxSize);
        for (int value : values) {
            queue.insert(value);
        }
        return queue;
    }

    private static int getMaxSize(int[] values) {
        int maxSize = 0;
        for (int value : values) {
            maxSize++;
        }
        return maxSize;
    }

}
