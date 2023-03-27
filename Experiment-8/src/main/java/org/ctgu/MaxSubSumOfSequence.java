package org.ctgu;

import java.util.Scanner;

/**
 * @author Elm Forest
 */
public class MaxSubSumOfSequence {
    public static int getMaxSubSum(int[] num) {
        int maxSum = 0;
        int numLen = num.length;
        if (numLen == 1) {
            return Math.max(num[0], 0);
        }
        for (int i = 1; i < numLen; i++) {
            if (num[i - 1] > 0) {
                num[i] = num[i - 1] + num[i];
            }
            maxSum = Math.max(maxSum, num[i]);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        int[] num = new int[arr.length];
        int numLen = num.length;
        for (int j = 0; j < numLen; j++) {
            num[j] = Integer.parseInt(arr[j]);
        }
        int maxSum = getMaxSubSum(num);
        System.out.println(maxSum);
    }
}