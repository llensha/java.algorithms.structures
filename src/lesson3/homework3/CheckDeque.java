package lesson3.homework3;

import lesson3.homework3.mydeque.Deque;
import lesson3.homework3.mydeque.DequeImpl;

public class CheckDeque {

    public static void main(String[] args) {

        System.out.println("Check deque");
        checkDeque();

    }

    private static void checkDeque() {

        Deque<Integer> deque = new DequeImpl<>(10);

        System.out.println("Deque insertLeft 0: " + deque.insertLeft(0) + info(deque));
        System.out.println("Deque insertLeft 1: " + deque.insertLeft(1) + info(deque));
        System.out.println("Deque insertLeft 2: " + deque.insertLeft(2) + info(deque));
        System.out.println("Deque insertLeft 3: " + deque.insertLeft(3) + info(deque));
        System.out.println("Deque insertRight -1: " + deque.insertRight(-1) + info(deque));
        System.out.println("Deque insertRight -2: " + deque.insertRight(-2) + info(deque));
        System.out.println("Deque insertRight -3: " + deque.insertRight(-3) + info(deque));
        System.out.println("Deque removeRight: " + deque.removeRight() + info(deque));
        System.out.println("Deque removeLeft: " + deque.removeLeft() + info(deque));
        System.out.println("Deque insertLeft 4: " + deque.insertLeft(4) + info(deque));
        System.out.println("Deque insertLeft 5: " + deque.insertLeft(5) + info(deque));
        System.out.println("Deque insertLeft 6: " + deque.insertLeft(6) + info(deque));
        System.out.println("Deque insertRight -4: " + deque.insertRight(-4) + info(deque));
        System.out.println("Deque insertRight -5: " + deque.insertRight(-5) + info(deque));
        System.out.println("Deque insertRight -6: " + deque.insertRight(-6) + info(deque));
        System.out.println("Deque removeRight: " + deque.removeRight() + info(deque));
        System.out.println("Deque insertRight -6: " + deque.insertRight(-6) + info(deque));
        System.out.println("Deque insertLeft 7: " + deque.insertLeft(7) + info(deque));

    }

    private static String info(Deque<Integer> deque) {
        String str = String.format(" (size = %d, peekHead = %s, peekTail = %s)", deque.size(), deque.peekHead(), deque.peekTail());
        return str;
    }
}
