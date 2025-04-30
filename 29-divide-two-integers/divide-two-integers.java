class Solution {
    public int divide(int dividend, int divisor) {
        // Handle overflow
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Determine the sign
        boolean negative = (dividend < 0) ^ (divisor < 0);

        long divd = Math.abs((long) dividend);
        long divs = Math.abs((long) divisor);

        int result = 0;
        while (divd >= divs) {
            long temp = divs, multiple = 1;
            while (divd >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }
            divd -= temp;
            result += multiple;
        }

        return negative ? -result : result;
    }
}
