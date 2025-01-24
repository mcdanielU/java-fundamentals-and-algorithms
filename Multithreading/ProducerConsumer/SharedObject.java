package Multithreading.ProducerConsumer;

public class SharedObject {
    private int value = 0;
    boolean flag = true; //Setting flag to true so producer sets value before consumer gets the value
    synchronized void setValue(int val) throws InterruptedException {
        while(!flag)
        {
            wait();
        }
        value = val;

        flag = false;
        notify();

    }

    synchronized int getValue() throws InterruptedException {
        while (flag)
        {
            wait();
        }
        flag = true;
        notify();
      return value;
    }
}
