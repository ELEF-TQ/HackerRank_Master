public public static int flippingMatrix(List<List<Integer>> matrix) {
    
    int sum = 0;
    int n = matrix.size();
    
    // Loop through the top-left quadrant of the matrix
    for (int i = 0; i < n / 2; i++) {
        for (int j = 0; j < n / 2; j++) {
            // Find the maximum of the 4 possible values in the matrix that can be flipped
            sum += Math.max(matrix.get(i).get(j),
                    Math.max(matrix.get(i).get(n - 1 - j),
                    Math.max(matrix.get(n - 1 - i).get(j),
                            matrix.get(n - 1 - i).get(n - 1 - j))));
        }
    }
    
    return sum;
}
