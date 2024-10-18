package Basics.Method;

public class MethOverload {
    public static int max (int a, int b)
    {
        return a>b?a:b;
    }


    public static float max(float a, float b)
    {
        return a>b?a:b;
    }

    public static int reverseInt(int a)
    {
        int rev = 0;
        while(a != 0)
        {
            rev = rev * 10 + a % 10;
            a = a/10;
        }

        return rev;
    }
    public static void main(String[] args) {
        System.out.println( max(1.2f,3.3f));
        System.out.println(reverseInt(3456));
    }
}
