package Maths;

import java.util.Scanner;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long ans = (n * (long) (n+1))/2;
        System.out.println(ans);
    }
}
