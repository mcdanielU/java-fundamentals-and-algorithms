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
            while(true){

                obj.getValue();
            }
        }
    }


