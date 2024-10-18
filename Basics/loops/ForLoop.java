package Basics.loops;

import java.util.Scanner;

//For loop should be used when there is a fixed iteration
public class ForLoop {
    public static void main(String[] args) {

//        System.out.println("Enter multiplication value for the value you want");
//        Scanner in = new Scanner(System.in);
//        int value = in.nextInt();
//        for (int i = 1; i<=12; i++)
//        {
//            System.out.printf("%d * %d = %d\n", value, i, value * i);
//        }

        //Another For loop practice
      //Display each individual digits in a number

//        int n = 257;
//        while(n!= 0)
//        {
//            int value = n % 10;
//            System.out.println(value);
//            n = n/10;
//        }

        //Count the digits of a number
//        long n = 123456789111L;
//        int count = 0;
//        while(n!=0)
//        {
//            count = count+1;
//            n = n/10;
//        }
//        System.out.println(count);

        Scanner in = new Scanner(System.in);
        System.out.println("Enter value to determine if it is an armstrong number");
        int digit = in.nextInt();
        int digitref = digit;
        int result = 0;

        while(digit != 0 )
        {
            int val = digit % 10;
            result += Math.pow(val , 3);
            digit = digit / 10;

        }

        if(result == digit )
        {
            System.out.println("This is an armstrong number ");
        }else {
            System.out.println("Not an armstrong number ");
        }

    }

}
