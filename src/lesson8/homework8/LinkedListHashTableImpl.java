package lesson8.homework8;

import lesson8.HashTable;

import java.util.LinkedList;
import java.util.Locale;

public class LinkedListHashTableImpl<K, V> implements HashTable<K, V> {

    private final int size = 32;
    private final int minChar = 1040;
    private final int maxChar = 1072;

    static class Node<K, V> implements Entry<K, V> {

        private final K key;
        private V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    private final LinkedList<Node<K, V>>[] data;
    //private final Node<K, V>[] data;

    public LinkedListHashTableImpl() {
        this.data = new LinkedList[size];
        for (int i = 0; i < data.length; i++) {
            data[i] = new LinkedList<>();
        }
    }

    @Override
    public boolean put(K key, V value) {
        int index = hash(key);
        if (index == -1) {
            return false;
        } else {
            data[index].add(new Node<>(key, value));
            return true;
        }

    }

    private int hash(K key) {
        String keyStr = ((String) key).toUpperCase(Locale.ROOT);

        if(keyStr.charAt(0) >= minChar && keyStr.charAt(0) <= maxChar) {
            return keyStr.charAt(0) - minChar;
        } else {
            return -1;
        }

    }

    @Override
    public V get(K key) {
        int index = hash(key);
        if (index == -1) {
            return null;
        } else {
            for (Node<K, V> node : data[index]) {
                if (node.getKey().equals(key)) {
                    return node.getValue();
                }
            }
            return null;
        }
    }

    @Override
    public V remove(K key) {
        int index = hash(key);
        if (index == -1) {
            return null;
        } else {
            for (Node<K, V> node : data[index]) {
                if (node.getKey().equals(key)) {
                    data[index].remove(node);
                    return node.getValue();
                }
            }
            return null;
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public void display() {
        System.out.println("----------");
        for (int i = 0; i < data.length; i++) {
            System.out.print(i + ": ");
            for (Node<K, V> node : data[i]) {
                System.out.print(node.toString() + ", ");
            }
            System.out.println();
        }

        System.out.println("----------");
    }
}
