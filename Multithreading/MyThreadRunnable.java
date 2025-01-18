package Multithreading;


public class MyThreadRunnable implements Runnable{
    public void run()
    {
        int i = 1;
        while(i!= 100)
        {
            System.out.println("Thread executing");
            i++;
        }
    }
}

class RunMyThreadRunnable
{
    MyThreadRunnable th = new MyThreadRunnable();

}