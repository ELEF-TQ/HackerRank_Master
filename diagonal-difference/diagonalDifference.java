public static int diagonalDifference(List<List<Integer>> arr) {
    int leftDiag = 0 ;
    int rightDiag = 0 ;
    
    for(int i=0 ; i < arr.size() ; i++){
        leftDiag += arr.get(i).get(i);
        rightDiag += arr.get(i).get(arr.size()-1-i);

    }
    
    return Math.abs(rightDiag-leftDiag);
    }