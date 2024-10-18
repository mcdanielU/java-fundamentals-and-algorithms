package Basics;

import java.util.Scanner;
import java.math.BigInteger;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter factorial value");
        Scanner in = new Scanner(System.in);
   BigInteger factValue = BigInteger.valueOf(in.nextInt());

   BigInteger value = factValue;
   for(int i = 1; i<value.intValue(); i++)
   {
       factValue = factValue .multiply (value.subtract(BigInteger.valueOf(i)) );

   }
        System.out.println(factValue);
   in.close();
    }
}
