public class MergeSort
{
    public static void conquer(int arr[],int si, int mid, int ei){
        int merged[] = new int[ei-si+1];
        int index1 = si;
        int index2 = mid+1;
        int x = 0; // index of merged array
        while(index1<=mid && index2<=ei){
            if(arr[index1]<=arr[index2]){
                merged[x++]=arr[index1++];
            }
            else{
                merged[x++]=arr[index2++];
            }
        }
        
        while(index1<=mid){
            merged[x++]=arr[index1++];
        }
        
        while(index2<=ei){
            merged[x++]=arr[index2++];
        }
        
        for(int i=0, j=si;i<merged.length;i++,j++){
            arr[j]=merged[i];
        }
    }
    public static void divide(int arr[],int si,int ei){
        if(si>=ei)
            return;
            
        int mid = si +(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid, ei);
    }
    public static void main(String args[])
    {
        int arr[] = {1,2,6,2,4,79,4};
        divide(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
