public static int sockMerchant(int n, List<Integer> ar) {
    Set<Integer> socks = new HashSet<>();
    int pairs = 0 ;
    for(int i=0 ; i < ar.size() ; i++){
        if(!socks.add(ar.get(i))){
            socks.remove(ar.get(i));
            pairs++ ;
        }
    }

    return pairs ;
    }