#include <iostream>
void merge(int arr[],int A[],int B[]){
using namespace std;
    int A[5]={1,2,5,8,9};
    int B[5]={3,4,6,10,11};
    int arr[10];
    int i=0,j=0,k=0;
    int m=5,n=5;
    while(i<m && j<n){
        if (A[i]<B[j]){
            arr[k]=A[i];
            i++;
            k++;
        }
        else{
            arr[k]=B[j];
            j++;
            k++;
        }
    }
for( ;i<m;i++){
    arr[k++]=A[i];
}
for( ;j<n;j++){
    arr[k++]=B[j];
}
for(int t=0;t<m+n;t++){
    cout<<arr[t]<<"\t";
}
}


