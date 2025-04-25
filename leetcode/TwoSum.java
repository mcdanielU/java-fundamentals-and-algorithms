package leetcode;

public class TwoSum {
    public int[] BruteForceN2()
    {
        int target = 9;
        int[] twoSum = {2,7,11,15};
        int[] correctValues = new int[2];

        for(int i = 0; i<twoSum.length; i++)
        {
            for(int j =i+1; j < twoSum.length; j++)
            {
                if((twoSum[i] + twoSum[j]) ==  target)
                {
                    correctValues[0] = i;
                    correctValues[1] = j;

                }

            }
        }

        return correctValues;
    }

    public int[] HashMap() {
    }
    public static void main(String[] args) {

     //Call either the bruteforce method here or the optimized method

    }
}
