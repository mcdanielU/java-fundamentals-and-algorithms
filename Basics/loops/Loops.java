package Basics.loops;

public class Loops {
    public static void main(String[] args) {

        doWhile();

    }

    //For loop iteration
    public static void ForLoop()
    {
        for(int i=0; i<=10; i++)
        {
            System.out.println(i);
        }
    }

    //Nested For Loop itertation
    public static void NestedLoop()
    {
        for(int i = 1; i<=5; i++)
        {
            for(int j = 1; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //While Loop
    public static void whileLoop() {
        //While a statement is true, keep executing
        int i = 0;
        //This starts an infinite while loop
        while(i<10)
        {
            System.out.println(i);
            i++;
        }
    }

    //Demonstration of ForEach Loop
    public static void forEach()
    {
        int arr[] = {2,4,2,2,5};
        for(int i : arr)
        {
            System.out.println(i);
        }
    }

    public static void doWhile()
    {
        int i = 0;
        do{
            System.out.println(i);
            i++;
        }while(i<10);
    }
}
