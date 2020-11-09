package lesson3.homework3.mydeque;

import lesson3.myqueue.Queue;

public interface Deque<E> extends Queue<E> {

    boolean insertLeft(E value);

    boolean insertRight(E value);

    E removeLeft();

    E removeRight();

    E peekTail();

}
