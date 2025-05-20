import java.util.*;

class Solution {
    public int sumSubarrayMins(int[] arr) {
        int[] nextmin = nextMin(arr);
        int[] prevmin = prevMin(arr);
        int n = arr.length;
        int mod = (int) 1e9 + 7;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            int left = prevmin[i] == -1 ? i + 1 : i - prevmin[i];
            int right = nextmin[i] == -1 ? n - i : nextmin[i] - i;
            sum = (sum + (long) arr[i] * left * right) % mod;
        }

        return (int) sum;
    }

    int[] nextMin(int[] arr) {
        int n = arr.length;
        int[] next = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] < arr[st.peek()]) {
                st.pop();
            }
            next[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        return next;
    }

    int[] prevMin(int[] arr) {
        int n = arr.length;
        int[] prev = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            prev[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        return prev;
    }
}
