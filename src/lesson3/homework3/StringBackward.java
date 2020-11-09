package lesson3.homework3;

import lesson3.mystack.Stack;
import lesson3.mystack.StackImpl;

import java.util.Scanner;

public class StringBackward {

    public static void main(String[] args) {

        String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("Исходная строка 1: " + str1);
        System.out.print("Обратная строка 1: ");
        printStringBackward(str1);

        System.out.println();

        String str2 = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        System.out.println("Исходная строка 2: " + str2);
        System.out.print("Обратная строка 2: ");
        printStringBackward(str2);

    }

    private static void printStringBackward(String str) {
        Stack<Character> stackStr = new StackImpl<>(str.length());
        for (int i = 0; i < str.length(); i++) {
            stackStr.push(str.charAt(i));
        }
        while (!stackStr.isEmpty()) {
            System.out.print(stackStr.pop());
        }
        System.out.println();
    }
}
