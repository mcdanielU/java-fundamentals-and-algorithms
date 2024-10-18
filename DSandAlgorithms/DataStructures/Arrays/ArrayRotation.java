package DSandAlgorithms.DataStructures.Arrays;
public class ArrayRotation {
    public static int A[] = {5,9,6,10,12,7,0,0,0,0};

    public static void insertA()
    {
     int B[] = ArrayRotation.A;

     int n = 6;
     int index = 2;
     for(int i = n; i>index; i--)
     {
         B[i] = B[i-1];
     }
     B[index] = 15;

     for (int x : B)
     {
         System.out.println(x+",");
     }
    }
    public static void main(String[] args) {


        insertA();

        //Rotation Array Practice
//        int temp = A[0];
//        for(int i=1; i<A.length;i++)
//        {
//            A[i-1] = A[i];
//        }
//        A[A.length-1] = temp;
//
//        System.out.print("[");
//        for (int x:A) {
//            System.out.print(x+",");
//        }
//        System.out.print("]");

    }


}
