public static void plusMinus(List<Integer> arr) {
    long pos = 0;
    long neg = 0;
    long nullCount = 0;
    int n = arr.size();

    for (int num : arr) {
        if (num > 0) {
            pos++;
        } else if (num < 0) {
            neg++;
        } else {
            nullCount++;
        }
    }

    // Print results with floating-point division
    System.out.printf("%.6f%n", (double) pos / n);
    System.out.printf("%.6f%n", (double) neg / n);
    System.out.printf("%.6f%n", (double) nullCount / n);
}
