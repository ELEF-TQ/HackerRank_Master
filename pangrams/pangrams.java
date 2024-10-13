public static String pangrams(String s) {
        
    s = s.toLowerCase();
    Set<Character> alphabet = new HashSet<>();
    
    for(char c:s.toCharArray()){
        if(Character.isLetter(c)) alphabet.add(c); 
    }
    
    if(alphabet.size() == 26) return "pangram";
    else return "not pangram";

}