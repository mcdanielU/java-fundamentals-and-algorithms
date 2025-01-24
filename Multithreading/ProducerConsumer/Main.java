package Multithreading.ProducerConsumer;

public class Main {
    public static void main(String[] args) {
        SharedObject ucheObject = new SharedObject();
        ProducerThread prodThread = new ProducerThread(ucheObject);
        ConsumerThread consumerThread = new ConsumerThread(ucheObject);
        prodThread.start();
        consumerThread.start();
    }
}
