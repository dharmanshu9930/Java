// Importing required classes
import java.util.Arrays;
import java.util.List;
 
// Main class
// RemoveZero
class GFG {
 
    // Method 1
    // to Remove leading zeros in a string
    public static String removeZero(String str)
    {
 
        // Count leading zeros
 
        // Initially setting loop counter to 0
        int i = 0;
        while (i < str.length() && str.charAt(i) == '0')
            i++;
 
        // Converting string into StringBuffer object
        // as strings are immutable
        StringBuffer sb = new StringBuffer(str);
 
        // The StringBuffer replace function removes
        // i characters from given index (0 here)
        sb.replace(0, i, "");
 
        // Returning string after removing zeros
        return sb.toString();
    }
 
    // Method 2
    // Main driver method
    public static void main(String[] args)
    {
 
        // Sample string input
        String str = "00000123569";
 
        // Calling method 1 to count leading zeroes
        // in above string
        str = removeZero(str);
 
        // Printing leading zeros inside string
        System.out.println(str);
    }
}
