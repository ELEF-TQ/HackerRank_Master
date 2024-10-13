public static int lonelyinteger(List<Integer> a) {
    Set<Integer> lonely = new HashSet<>();
    
    for(int num:a){
        if(!lonely.add(num)) lonely.remove(num);
    }
    
    return lonely.iterator().next();

    }