package Sandbox.Arrays;

public class Basic {
    public static void main(String[] args) {
        int A[] = new int[5];
        A[0] = 15;
        A[4] = 12;

        int B[] = {1,3,5,7,9};

        for (int x : A)
        {
            System.out.println(x);
        }


        for(int i=0; i<B.length;i++)
        {
            System.out.println(B[i]++);
        }


        for (int y : B)
        {
            System.out.println(y);
        }
    }
}
