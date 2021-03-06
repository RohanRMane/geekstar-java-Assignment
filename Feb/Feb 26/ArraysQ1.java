//https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

public class ArraysQ1 {

    static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start < end) {
            int sum = numbers[start] + numbers[end];
            if (sum == target) {
                return new int[] { start + 1, end + 1 };
            } else if (target > sum) {
                start++;
            } else {
                end--;
            }
        }
        return new int[] { -1, -1 };
    }
     public static void main(String[] args) {
        int[] arrOne = { 2, 7, 11, 15 };
        int targetOne = 9;
        int[] result = twoSum(arrOne, targetOne);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        int[] arrTwo = { 2, 3, 4 };
        int targetTwo = 6;
        result = twoSum(arrTwo, targetTwo);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
        int[] arrThree = { -1, 0 };
        int targetThree = -1;
        result = twoSum(arrThree, targetThree);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

}