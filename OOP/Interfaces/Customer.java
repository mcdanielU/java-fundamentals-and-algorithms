package OOP.Interfaces;

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

class CallBackImplementation
{


    public static void main(String[] args) {
        Store store = new Store();

        Runnable task1 = () -> store.registerMembers(new Customer("Uche"));
        Runnable task2 = () -> store.registerMembers(new Customer("James"));
        Runnable task3 = () -> store.registerMembers(new Customer("John"));

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);
        Thread t3 = new Thread(task3);

        t1.start();
        t2.start();
        t3.start();
    }
}

