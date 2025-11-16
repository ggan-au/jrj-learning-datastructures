package ds.queue;

public class App {
    public static void main(String[] args) {
        Queue myQueue = new Queue(5);
        myQueue.insert(100);
        myQueue.insert(101);
        myQueue.insert(102);
        myQueue.insert(103);
        myQueue.insert(104);
        myQueue.insert(105);
        myQueue.insert(106);
        myQueue.insert(107);
        myQueue.view();
    }
}
