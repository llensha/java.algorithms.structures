package lesson8.homework8;

import lesson8.HashTable;

public class Main8_DZ {
    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new LinkedListHashTableImpl<>();
        hashTable.put("Апельсин", 110);
        hashTable.put("Авокадо", 220);
        hashTable.put("Банан", 330);
        hashTable.put("Батат", 440);
        hashTable.put("Дыня", 550);
        hashTable.put("Манго", 660);
        hashTable.put("Нектарин", 770);
        hashTable.put("Персик", 880);
        hashTable.put("Паприка", 990);
        hashTable.put("Яблоко", 1000);

        System.out.println("Size is " + hashTable.size());
        hashTable.display();

        System.out.println("Цена Авокадо = " + hashTable.get("Авокадо"));
        System.out.println("Цена Банана =  " + hashTable.get("Банан"));
        System.out.println("Цена Нектарина =  " + hashTable.get("Нектарин"));

        System.out.println("\nУдаление");
        System.out.println(hashTable.remove("Авокадо"));
        System.out.println("Цена Авокадо = " + hashTable.get("Авокадо"));
        System.out.println(hashTable.remove("Нектарин"));
        System.out.println("Цена Нектарина = " + hashTable.get("Нектарин"));

        hashTable.display();
    }
}
