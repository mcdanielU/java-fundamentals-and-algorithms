package Sandbox.Arithemetic;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter factorial value");
        Scanner in =new Scanner(System.in);
        int n = in.nextInt();
        int value = 1;
        for(int i =1; i<=n; i++)
        {
            value *= i;

        }
        System.out.println(value);
    }
}
