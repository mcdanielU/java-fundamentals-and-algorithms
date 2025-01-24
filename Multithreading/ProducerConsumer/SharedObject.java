package Multithreading.ProducerConsumer;

public class SharedObject {
    private int value;

    synchronized void setValue(int val)
    {
        this.value = val;
    }

    synchronized int getValue()
    {
        return this.value;
    }
}
