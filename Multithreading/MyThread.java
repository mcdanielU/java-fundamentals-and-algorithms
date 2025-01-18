package Multithreading;

 public class MyThread extends Thread{
     @Override
     public void run()
     {
         int i =1;
         while(true)
         {
             System.out.println(i);
             i++;
         }
     }

}
//This is an infinite loop
class RunMyThread{
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        int i = 1;
        while(true)
        {
            System.out.println(i+ "world");
            i++;
        }
    }
}