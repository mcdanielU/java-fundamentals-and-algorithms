package DSandAlgorithms.DataStructures.Arrays;
import java.lang.System;


public class Array_01{

    public static String intToString(int x)
    {
        boolean isNegative = false;


        if (x < 0)
        {
            isNegative = true;
        }
        StringBuilder s = new StringBuilder();

        do {
            s.append((char)('0' + Math.abs(x % 10)));
            x /= 10;
        }while(x != 0);
      
        if(isNegative)
        {
            s.append("-");
        }
        s.reverse();

        return s.toString();

    }

    public static void main(String[] args) {
       System.out.println(intToString(-123));
    }
}
