package Multithreading.ProducerConsumer;

public class ConsumerThread extends Thread {

    SharedObject obj;

    public ConsumerThread(SharedObject myObj)
    {
        obj = myObj;
    }

    @Override
    public void run()
    {
            while(true) {
                try {
                    System.out.println("The value from the Object is " + obj.getValue());
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }


