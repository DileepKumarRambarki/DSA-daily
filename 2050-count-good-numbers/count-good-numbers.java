class Solution {
    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;
        long odd = n / 2;
        long mod = 1000000007L;
        long count = (pow(5, even, mod) * pow(4, odd, mod)) % mod;
        return (int) count;
    }
    
    private long pow(long x, long n, long mod) {
        if (n == 0) return 1;
        long half = pow(x, n / 2, mod);
        long result = (half * half) % mod;
        if (n % 2 == 1) {
            result = (result * x) % mod;
        }
        return result;
    }
}