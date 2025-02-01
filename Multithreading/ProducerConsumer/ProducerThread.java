package Multithreading.ProducerConsumer;

public class ProducerThread extends Thread {
    SharedObject obj;

    public ProducerThread(SharedObject myObj) {
        obj = myObj;
    }

    @Override
    public void run() {
        int i = 1;
        while(true){

            obj.setValue(i);
            i++;

        }
    }
}


