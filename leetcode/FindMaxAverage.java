package leetcode;

public class FindMaxAverage {
    public static void findMaxAverageMethod(int[] nums, int k) {
        int arr_length = nums.length;
        int current_sum = 0;
        for(int i=0; i<k;i++)
        {
            current_sum+=nums[i];

        }
        float max_average = (float) current_sum/k;

        for(int i=k; i<arr_length; i++)
        {
            current_sum+=nums[i];
            current_sum-=nums[i-k];
            float average = (float) current_sum / k;
            if (average > max_average)
                max_average = average;
        }

        System.out.println(max_average);

    }

    public static void main(String[] args) {
        FindMaxAverage.findMaxAverageMethod(new int[]{1, 12, -5, -6, 50, 3}, 4);
    }
}
