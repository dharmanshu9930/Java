/*
Java Program to reverse a string using the stack.
 */

package Stacks;

import java.util.Arrays;
import java.util.Scanner;

public class reverseStringUsingStack {

    private Node top;
    private int length;
    private static class Node{
        private char data;
        private Node next;

        public Node(char data){
            this.data = data;
        }
    }

    public reverseStringUsingStack(){
        top = null;
        length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void push(char data){
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public char pop(){
        char val = top.data;
        top = top.next;
        length--;
        return val;
    }

    public int getLength(){
        return length;
    }

    public String reversString(String str){

        char[] ch = str.toCharArray();
        for(char c : ch){
            push(c);
        }

        for(int i = 0; i < str.length(); i++){
            ch[i] = pop();
        }

        return new String(ch);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        reverseStringUsingStack revStr = new reverseStringUsingStack();
        String str = sc.nextLine();
        System.out.println("Given String : " + str);
        System.out.println("Reversed String :" + revStr.reversString(str));
    }

}
