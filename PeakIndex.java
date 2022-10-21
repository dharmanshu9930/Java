// https://leetcode.com/problems/peak-index-in-a-mountain-array/

/*
problem statement - An array arr a mountain if the following properties hold:
arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
Given a mountain array arr, return the index i such that arr[0] < arr[1] < ... < arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].
You must solve it in O(log(arr.length)) time complexity.

Input: arr = [0,1,0]
Output: 1

*/


// code : 

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        
        int size = arr.length-1;
        
        if(size==0){
            return 0;
        }
            int start = 0;
            int end = size;
            while(start<=end){
                int mid = start + (end-start)/2;
                if(mid>0 && mid<size){
                    if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                        return mid;
                    }
                    else if(arr[mid+1]>arr[mid]){
                        start = mid+1;
                    }
                    else{
                        end = mid-1;
                    }
                }
                else if(mid==0){
                    if(arr[0]>arr[1]){
                        return 0;
                    }
                    else{
                        return 1;
                    }
                }
                else if(mid==size){
                    if(arr[size]>arr[size-1]){
                        return size;
                    }
                    else{
                        return size-1;
                    }
                }
            }
        return -1;
    }
}