package Multithreading;

 public class MyThread extends Thread{
     @Override
     public void run()
     {
         System.out.println(45);
     }
}
//This is an infinite loop
class RunMyThread{
    public static void main(String[] args) {
        Thread t = new Thread("Uche");
        System.out.println(t.getThreadGroup());
//        int i = 1;
//        while(true)
//        {
//            System.out.println(i+ "world");
//            i++;
//        }

    }
}