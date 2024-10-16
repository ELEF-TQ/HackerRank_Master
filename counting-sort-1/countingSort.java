public static List<Integer> countingSort(List<Integer> arr) {
    int[] count = new int[100];
    List<Integer> result = new ArrayList<>();
    for(int num:arr){
        count[num]++;
    }
    
    for(int num:count){
        result.add(num);
    }
    
    return result ;

 }