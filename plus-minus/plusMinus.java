public static void plusMinus(List<Integer> arr) {
    int n = arr.size();

    long pos = arr.stream().filter(num -> num > 0).count();
    long neg = arr.stream().filter(num -> num < 0).count();
    long nullCount = arr.stream().filter(num -> num == 0).count();

    // Print results with floating-point division
    System.out.printf("%.6f%n", (double) pos / n);
    System.out.printf("%.6f%n", (double) neg / n);
    System.out.printf("%.6f%n", (double) nullCount / n);
}
