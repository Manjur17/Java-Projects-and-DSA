package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        if (n % 2 == 1) {
            System.out.println("still running");
        } else {
            for (int i = 0; i < n - 2; i++) {
                count = count + (arr[2 * i + 1] - arr[2 * i]);
            }
            System.out.println(count);
        }

    }
}
