public static int fibonacci(int n, int[] memo) {
    if (n <= 1) return n;
    
    if (memo[n] != 0) return memo[n];
    memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
    return memo[n];
}

