package Collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class ArrayDequeueDemo {
    public static void main(String[] args) {
        ArrayDeque<ObjectTest>  myObjectTest = new ArrayDeque<>();
        myObjectTest.offerLast(new ObjectTest("First recording", ObjectTest.AudioType.WAV));
        myObjectTest.offerLast(new ObjectTest("Second Recording", ObjectTest.AudioType.MP3));
        myObjectTest.offerLast(new ObjectTest("Third Recording", ObjectTest.AudioType.TIFF));

        while(!myObjectTest.isEmpty()) {
            System.out.println(myObjectTest.poll().retrieveAudioType());
        }
    }
}
