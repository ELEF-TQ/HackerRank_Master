public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
    List<Integer> result = new ArrayList<>();
    
    for(String query:queries){
        int count = 0;
        for(String str:strings){
            if(str.equals(query)){
                count++;
            }
        }
        
        result.add(count);
    }
    
    return result;

}