package Multithreading.ProducerConsumer;

public class ProducerThread extends Thread {
    SharedObject obj;

    public ProducerThread(SharedObject myObj)
    {
       obj = myObj;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 50; i++)
        {
            System.out.println("Running producer thread and setting object value "+i);
            this.obj.setValue(i);
        }
    }

}
