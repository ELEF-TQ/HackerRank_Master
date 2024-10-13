public static void plusMinus(List<Integer> arr) {
    long posCount = 0;
    long negCount = 0;
    long nullCount = 0;
    int n = arr.size();

    for (int num : arr) {
        if (num > 0) {
            posCount++;
        } else if (num < 0) {
            negCount++;
        } else {
            nullCount++;
        }
    }
  
    System.out.printf("%.6f%n", (double) posCount / n);
    System.out.printf("%.6f%n", (double) negCount / n);
    System.out.printf("%.6f%n", (double) nullCount / n);
}
