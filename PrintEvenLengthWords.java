// Java program to print 
// even length words in a string 

class PrintEvenLengthWords { 
    public static void printWords(String s) 
    { 
    
    // Splits Str into all possible tokens 
    for (String word : s.split(" ")) 
    
    // if length is even 
    if (word.length() % 2 == 0) 
    
        // Print the word 
        System.out.println(word); 
    } 
    
    // Driver Code 
    public static void main(String[] args) 
    { 
    
    String s = "hello my name is Debangshu Kantha"; 
    printWords(s); 
    } 
    } 
    