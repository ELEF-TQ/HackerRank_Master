public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
 
    // ascending order
    A.sort(null);
    // descending order
    B.sort(Collections.reverseOrder());
    
    
    for (int i = 0; i < A.size(); i++) {
        if (A.get(i) + B.get(i) < k) {
            return "NO";  
        }
    }
    
    return "YES";  
}