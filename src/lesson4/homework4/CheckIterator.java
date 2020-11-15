package lesson4.homework4;

public class CheckIterator {

    public static void main ( String [] args ) {
        MyLinkedList list = new MyLinkedList();
        LinkIterator itr = new LinkIterator(list);

        itr.insertAfter ("Artem" ,20);
        itr.insertBefore ("Sergey" ,10);
        itr.insertBefore ("Ivan" ,30);
        itr.insertAfter ("Mikhail" ,40);
        itr.reset();
        itr.insertBefore("Anton", 15);
        itr.nextLink();
        itr.nextLink();
        System.out.print("Текущая позиция: ");
        itr.displayCurrent();
        itr.deleteCurrent();
        itr.insertAfter("Roman" ,5);
        itr.nextLink();

        list.display();
        System.out.println("Итератор в конце списка: " + itr.atEnd());
    }

}

class Link {

    public String name;
    public int age;
    public Link next;

    public Link (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println("Name: " + this.name + ", age: " + this.age);
    }

}

class MyLinkedList {

    private Link first;

    public MyLinkedList() {
        first = null;
    }

    public Link getFirst() {
        return first;
    }

    public void setFirst(Link first) {
        this.first = first;
    }

    public LinkIterator getIterator() {
        return new LinkIterator(this);
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void display() {
        Link current = first ;
        while (current != null) {
            current.display();
            current = current.next ;
        }
    }

}

class LinkIterator {

    private Link current;
    private Link previous;
    private MyLinkedList list;

    public LinkIterator(MyLinkedList list) {
        this.list = list;
        this.reset();
    }

    public void reset() {
        current = list.getFirst();
        previous = null;
    }

    public boolean atEnd() {
        return (current.next == null);
    }

    public void nextLink() {
        previous = current;
        current = current.next;
    }

    public Link getCurrent() {
        return current;
    }

    public void insertAfter(String name, int age) {
        Link newLink = new Link(name, age);
        if (list.isEmpty()) {
            list.setFirst(newLink);
            current = newLink;
        } else {
            newLink.next = current.next;
            current.next = newLink;
            nextLink();
        }
    }

    public void insertBefore(String name, int age) {
        Link newLink = new Link (name, age);
        if (previous == null){
            newLink.next = list.getFirst();
            list.setFirst(newLink);
            reset();
        } else {
            newLink.next = previous.next;
            previous.next = newLink;
            current = newLink;
        }
    }

    public String deleteCurrent() {
        String name = current.name;
        if (previous == null) {
            list.setFirst(current.next);
            reset();
        } else {
            previous.next = current.next;
            if (atEnd()) {
                reset();
            } else {
                current = current.next;
            }
        }
        return name;
    }

    public void displayCurrent() {
        current.display();
    }
}
