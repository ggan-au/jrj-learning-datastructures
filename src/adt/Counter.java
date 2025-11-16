package adt;

public class Counter {
    int counter;
    String name;

    public Counter (String name) {
        this.name = name;
        this.counter = 0;
    }

    public void increment() {
        counter++;
    }

    public int getCurrentValue() {
        return counter;
    }

    @Override
    public String toString() {
        return this.name + " : " + this.counter;
    }
}
