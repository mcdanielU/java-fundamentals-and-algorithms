package Multithreading.ProducerConsumer;

import jdk.jshell.spi.ExecutionControl;

public class SharedObject {
    private int value = 0;
    boolean flag = true; //Setting flag to true so producer sets value before consumer gets the value
    synchronized void setValue(int val) {
        while (!flag) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        value = val;
        System.out.println("Producer produces "+value);
        flag = false;
        notify();
    }


    synchronized int getValue () {


        while (flag) {
            try {
                wait();
            } catch (Exception e) {
            }
        }

        System.out.println("Consumer consumes "+value);

        flag = true;
        notify();
        return value;
    }
}

