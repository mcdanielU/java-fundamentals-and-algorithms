package OOP.Interfaces;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

interface Member{
    void callback();
}

class Store
{
    Member mem[] = new Member[100];
    int count = 0;

    public synchronized void registerMembers(Member member)
    {
        mem[count] = member;
        count++;
        member.callback();
    }



}
public class Customer implements Member{
    private String name;
    public Customer(String name)
    {
        this.name = name;
    }
    @Override
    public void callback()
    {
        System.out.println("Customers registered "+name);
    }
}
class MyThread extends Thread {
    public void run() {
        try {
            Thread.sleep(2000); // Blocking the thread (not main thread)
            System.out.println("Task running on " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        }
}
class CallBackImplementation
{


    public static void main(String[] args) throws InterruptedException{
        MyThread t1 = new MyThread();
        System.out.println("Main thread starts");

        t1.start();
        t1.join();
        System.out.println("Main thread finished");
    }
}

