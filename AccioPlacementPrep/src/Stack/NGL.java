package Stack;

import java.util.Scanner;
import java.util.Stack;

public class NGL {
    //Next Greater Element To The Left
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int[] ans = NGL(arr);
        for (int num : ans) {
            System.out.print(num + " ");
        }
    }

    public static int[] NGL(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.empty() && st.peek() <= arr[i]) {
                st.pop();
            }

            ans[i] = st.empty() ? -1 : st.peek();

            st.push(arr[i]);
        }

        return ans;
    }
}
