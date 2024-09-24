package Sandbox.StringClass;

public class StringPractice {
    public static void main(String[] args) {
        String str1  = "Java program"; //String literal being created in the pool
        String str2 = new String("Java"); // String Object being created in heap
        char char1 = 65;
        byte b[] = {65,66,67,68};
        char c[] = {25,'a','v','a'};
        int u = 0;

        int i = 2;
        String str4 = new String(b);

        System.out.println(str4);

    }
}
