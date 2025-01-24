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
        for (int i=0; i<=50; i++)
        {
            System.out.println("The value from the Object is "+  obj.getValue());

        }
    }

}
