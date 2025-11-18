package ds.singlyLinkedList;

public class App {
    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.insertFirst(100);
        myList.insertFirst(99);
        myList.insertFirst(98);
        myList.insertFirst(97);
        myList.insertLast(200);
        myList.insertFirst(300);
        myList.displayList();
    }
}
