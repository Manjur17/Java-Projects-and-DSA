package Patterns;

import java.util.Scanner;

public class CharacterPattern5 {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = s.nextInt();
    int i = 1;
        while (i <= n) {
            char p= (char)('A' + i -1);
            int j=1;
            while (j <= i) {
                System.out.print( p + " ");
                p=(char)(p+1);
                j++;
            }
            System.out.println();
            i++;
        }
}
}
