package lesson2;

import java.util.*;

public class CheckSortArray {
    private static final int initialCapacity = 100000;

    public static void main(String[] args) {
        checkSortDynamicArray();
    }

    private static void checkSortDynamicArray() {
        Random random = new Random();

        Array<Integer> arr1 = new ArrayImpl<>(initialCapacity);
        for (int i = 0; i < initialCapacity; i++) {
            arr1.add(random.nextInt(999999));
        }

        Array<Integer> arr2 = new ArrayImpl<>(initialCapacity);
        for (int i = 0; i < initialCapacity; i++) {
            arr2.add(arr1.get(i));
        }

        Array<Integer> arr3 = new ArrayImpl<>(initialCapacity);
        for (int i = 0; i < initialCapacity; i++) {
            arr3.add(arr1.get(i));
        }

        checkSortBubble(arr1);
        checkSortSelect(arr2);
        checkSortInsert(arr3);

    }

    private static void checkSortBubble(Array<Integer> arr) {
        display(arr, "пузырьком");

        long timeStart = System.currentTimeMillis();
        arr.sortBubble();
        long timeEnd = System.currentTimeMillis();

        display(arr, timeEnd-timeStart);
    }

    private static void checkSortSelect(Array<Integer> arr) {
        display(arr, "выбором");

        long timeStart = System.currentTimeMillis();
        arr.sortSelect();
        long timeEnd = System.currentTimeMillis();

        display(arr, timeEnd - timeStart);
    }

    private static void checkSortInsert(Array<Integer> arr) {
        display(arr, "вставками");

        long timeStart = System.currentTimeMillis();
        arr.sortInsert();
        long timeEnd = System.currentTimeMillis();

        display(arr, timeEnd - timeStart);
    }

    private static void display(Array<Integer> arr, String text) {
        System.out.println(String.format("\nСортировка %s", text));
        System.out.println("Начальный массив:");
        System.out.println("Первые 30 чисел массива:");
        for (int i = 0; i < 30; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println("\nПоследние 30 чисел массива:");
        for (int i = initialCapacity-30; i < initialCapacity; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }

    private static void display(Array<Integer> arr, long time) {
        System.out.println("Отсортированный массив:");
        System.out.println("Первые 30 чисел массива:");
        for (int i = 0; i < 30; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println("\nПоследние 30 чисел массива:");
        for (int i = initialCapacity-30; i < initialCapacity; i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println("\nЗатраченное время: " + time);
    }

}
