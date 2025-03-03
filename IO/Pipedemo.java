package IO;

import java.io.*;

class Producer extends Thread {
    private OutputStream os;

    public Producer(OutputStream o) {
        this.os = o;
    }

    @Override
    public void run() {
        int count = 1;
        try {
            while (count <= 10) { // Prevent infinite loop
                os.write(count);
                os.flush();
                System.out.println("Producer count: " + count);
                count++;
                Thread.sleep(500); // Slow down the producer to avoid overwhelming the buffer
            }
        } catch (Exception e) {
            System.err.println("Producer error: " + e.getMessage());
        } finally {
            try {
                os.close(); // Close the stream when done
            } catch (IOException e) {
                System.err.println("Error closing OutputStream: " + e.getMessage());
            }
        }
    }
}

// Consumer thread
class Consumer extends Thread {
    private InputStream is;

    public Consumer(InputStream i) {
        this.is = i;
    }

    @Override
    public void run() {
        int x;
        try {
            while ((x = is.read()) != -1) { // Check for end of stream
                System.out.println("Consumer received: " + x);
                Thread.sleep(700); // Slow down consumer to simulate processing delay
            }
        } catch (Exception e) {
            System.err.println("Consumer error: " + e.getMessage());
        } finally {
            try {
                is.close(); // Close the stream when done
            } catch (IOException e) {
                System.err.println("Error closing InputStream: " + e.getMessage());
            }
        }
    }
}

public class Pipedemo {
    public static void main(String[] args) throws IOException {
        PipedOutputStream po = new PipedOutputStream();
        PipedInputStream pi = new PipedInputStream(po);

        Producer p = new Producer(po);
        Consumer c = new Consumer(pi);

        p.start();
        c.start();

        try {
            p.join(); // Wait for producer to finish
            c.join(); // Wait for consumer to finish
        } catch (InterruptedException e) {
            System.err.println("Main thread interrupted: " + e.getMessage());
        }

        System.out.println("Main thread finished.");
    }
}