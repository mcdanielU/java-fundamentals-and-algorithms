package Exceptions;

public class ArithemeticAndArrayOutOfBounds {
    public static void main(String[] args) {
        try
        {
             int arrayValueDivided;
            int array[] = {0,2,4,6,8,10};

        }catch (ArithmeticException e)
        {
            System.out.println("You cant divide a number by zero");
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("You are attempting to go to an unreachabkle index element");
        }

    }
}
