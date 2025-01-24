package Multithreading.ProducerConsumer;

public class ProducerThread extends Thread {
    SharedObject obj;

    public ProducerThread(SharedObject myObj) {
        obj = myObj;
    }

    @Override
    public void run() {
        int i =1;
        while (true) {
            System.out.println("Running producer thread and setting object value " + i);
            try {
                this.obj.setValue(i);
                i++;
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


