/*

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.



Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

 */

import java.util.Scanner;

public class Product_of_Array_Except_Itself {


        public static int[] productExceptSelf(int[] nums) {
            int res[] = new int[nums.length];
            int k = 0;
            for (int i = 0; i < nums.length; i++) {
                int r = 1;
                for (int j = 0; j < nums.length; j++) {
                    if (i != j) {
                        r *= nums[j];
                    }
                }
                res[k] = r;
                k++;
            }
            return res;
        }

        public static  void main(String [] args)
        {

            Scanner sc=new Scanner(System.in);

            int n=sc.nextInt();

            int[] nums=new int[n];

            for(int i=0;i<n;i++)
            {
                nums[i]=sc.nextInt();
            }
            int[] arr=productExceptSelf(nums);

            for(int i:arr)
            {
                System.out.print(i + " ");
            }
        }

}
