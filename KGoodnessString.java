import java.io.IOException;
import java.util.Scanner;

public class KGoodnessString {
    public static void main(String[]args)throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int min;
            int x = 0;
            for(int i=0;i<n/2;i++){
                if(s.charAt(i)!=s.charAt(n-i-1))x++;
            }
            if(x>k)min = x-k;
            else min = k-x;
            System.out.println(min);
        }
    }
}
