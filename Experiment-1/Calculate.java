package work_one;

import java.util.Scanner;

/**
 * @author Zhang 1Jinming
 * &#064;date  5/9/2022 上午8:49
 */
public class Calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        int[] num = new int[arr.length];
        for (int j = 0; j < num.length; j++) {
            num[j] = Integer.parseInt(arr[j]);
        }
        int maxs = 0;
        for (int i = 0; i < num.length - 1; i++) {
            maxs = Math.max(maxs, num[i] + num[i + 1]);
        }
        System.out.println(maxs);
    }
}
