package lesson4.homework4;

import lesson3.myqueue.Queue;
import lesson3.mystack.Stack;
import lesson4.*;


public class CheckLesson4 {

    public static void main(String[] args) {
        System.out.println("Check SimpleLinkedList");
        checkLinkedList();
        System.out.println("\nCheck Stack");
        checkStack();
        System.out.println("\nCheck Queue");
        checkQueue();
        System.out.println("\nCheck TwoSideLinkedList");
        checkTwoSideLinkedList();
    }

    private static void checkLinkedList() {
        LinkedList<Character> linkedList = new SimpleLinkedListImpl<>();
        linkedList.insertFirst('A');
        linkedList.insertFirst('B');
        linkedList.insertFirst('C');
        linkedList.insertFirst('D');

        linkedList.display();

        System.out.println("Find B: " + linkedList.contains('A'));
        System.out.println("Find D: " + linkedList.contains('B'));
        System.out.println("Find A: " + linkedList.contains('C'));
        System.out.println("Find Z: " + linkedList.contains('Z'));

        linkedList.removeFirst();
        linkedList.remove('B');

        linkedList.display();
    }

    private static void checkStack() {

        Stack<Integer> stack = createAndPushStack(0,1,2,3,4,5,6,7,8,9);

        System.out.println("Stack size: " + stack.size());
        System.out.println("Stack top: " + stack.peek());
        System.out.print("Stack: ");
        extractStack(stack);
    }

    private static Stack<Integer> createAndPushStack(int... values) {
        Stack<Integer> stack = new LinkedStackImpl<>();
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
        Queue<Integer> queue = createAndInsertQueue(0,1,2,3,4,5,6,7,8,9);

        System.out.println("Queue size: " + queue.size());
        System.out.println("Queue head: " + queue.peekHead());
        System.out.print("Queue: ");
        extractQueue(queue);
    }

    private static Queue<Integer> createAndInsertQueue(int... values) {
        Queue<Integer> queue = new LinkedQueueImpl<>();
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

    private static void checkTwoSideLinkedList() {

        TwoSideLinkedList<Integer> list = new TwoSideLinkedListImpl<>();

        list.insertFirst(0);
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertLast(-1);
        list.insertLast(-2);
        list.insertLast(-3);
        list.remove(1);
        list.removeFirst();
        list.remove(-3);
        list.insertFirst(4);
        list.insertLast(-4);
        list.insertFirst(5);
        list.insertLast(-5);
        list.remove(-1);

        list.display();

        System.out.println("Find 0: " + list.contains(0));
        System.out.println("Find 5: " + list.contains(5));
        System.out.println("Find -2: " + list.contains(-2));
        System.out.println("Find 7: " + list.contains(7));
    }


}