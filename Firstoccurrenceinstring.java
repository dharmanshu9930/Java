class Firstoccurrenceinstring {
    public int strStr(String haystack, String needle) {

        if(needle.isEmpty()) return 0;
        if(haystack.isEmpty()) return -1;
        int n = needle.length();
        for(int i=0;i<=haystack.length() - needle.length();i++){
           if(needle.equals(haystack.substring(i,i+n))){
               return i;
           }
       } 
        return -1;
    }
}
