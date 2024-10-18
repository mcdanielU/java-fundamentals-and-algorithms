package DSandAlgorithms.DataStructures.Arrays;

public class Array2d {
    public static void main(String[] args) {
         int A[][] = new int[3][4];
          int B[][]  = {{1,2,3,4}, {2,4,6,8}, {3,5,7,9}};

          for (int i = 0; i<B.length; i++)
          {
                for(int j=0; j<B[0].length; j++)
                {
                    System.out.println(B[j]);

                }
          }
    }
}
