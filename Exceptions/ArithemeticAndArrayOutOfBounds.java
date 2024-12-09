package Exceptions;

public class ArithemeticAndArrayOutOfBounds {
    public static void main(String[] args) {
        try
        {
             int arrayValueDivided;
            int array[] = {0,2,4,6,8,10};
            arrayValueDivided = array[1]/array[0];

            int getLastElement = array[6];
        }catch (ArithmeticException e)
        {
            System.out.println(e);
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

    }
}
