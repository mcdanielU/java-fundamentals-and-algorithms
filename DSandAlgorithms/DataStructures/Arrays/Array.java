package DSandAlgorithms.DataStructures.Arrays;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        System.out.println("Choose an operation");
        Scanner in = new Scanner(System.in);
        String input = in.next();
        switch (input) {
            case "sum":
                System.out.println(sum());
                break;
            case "search":
                System.out.println(search(5));
            break;
        }
        in.close();

    }

    private static int sum ()
    {
        int sum = 0;
        int Array[] = {3,9,7,8,12,6,15,5,4,10};
        for (int i = 0; i< Array.length; i++)
        {
            sum = sum + Array[i];
        }
        return sum;
    }

    private static int search(int val)
    {
        int Array[] = {3,9,7,8,12,6,15,5,4,10};
        for(int i = 0; i <Array.length; i++)
        {
            if (Array[i] == val)
            {
                return i;
            }
        }
        System.out.println("Element not found");
    return 0;
    }
}
