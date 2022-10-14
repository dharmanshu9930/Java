

import java.util.*;
public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        move(n,'A','B','C');

    }
    public static void move(int n,char s,char h,char d)
    {
        if(n==0)
            return;
        if(n==1)
            System.out.println(s+"-->"+d);
        else
        {
            move(n-1,s,d,h);
            System.out.println(s+"-->"+d);
            move(n-1,h,s,d);
        }
    }
}
