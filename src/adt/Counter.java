package adt;

public class Counter {
    private int counter = 0;
    private String name = null;

    public Counter (String name) {
        this.name = name;
    }

    public void increment() {
        counter++;
    }

    public int getCurrentValue() {
        return counter;
    }

    @Override
    public String toString() {
        return this.name + ": " + this.counter;
    }
}
