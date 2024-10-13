public static void miniMaxSum(List<Integer> arr) {
    long totalSum = 0;
    int min = arr.get(0);
    int max = arr.get(0);


    for (int num : arr) {
        totalSum += num;
        if (num < min) min = num;
        if (num > max) max = num;
    }

    long maxSum = totalSum - min;
    long minSum = totalSum - max;

    // Print the results
    System.out.println(minSum + " " + maxSum);
}
