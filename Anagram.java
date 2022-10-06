package com.company;
import java.util.*;

public class Anagram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if (a.length()!=b.length()){
            System.out.println("Not Anagram");
        }
        else{
            int i,j,k,c,c1,ana=0;
            char ch;
            for(i=0;i<a.length();i++){
                ch = a.charAt(i);
                c=0;c1=0;
                for(j=0;j<a.length();j++){
                    if(ch==a.charAt(j))
                        c++;
                }
                for(k=0;k<b.length();k++){
                    if(ch==b.charAt(k))
                        c1++;
                }
                if(c1==c){
                    continue;
                }
                else{
                    ana=1;
                    break;
                }
            }
            if(ana==0)
                System.out.println("Anagram");
            else
                System.out.println("Not Anagram");
        }

    }
}
