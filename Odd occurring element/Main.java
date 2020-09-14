#include<iostream>
using namespace std;

void search(int arr[], int low, int high){
    if(low > high)
        return;

    if(low==high){
        cout<<arr[low]<<endl;
        return;
    }

    int mid = (low+high)/2;

    if(mid%2==0){
        if(arr[mid]==arr[mid+1])
            search(arr, mid+2, high);
        else
            search(arr, low, mid);
    }
    else{
        if(arr[mid]==arr[mid-1])
            search(arr, mid+1, high);
        else
            search(arr, low, mid-1);   
    }
}

int main(){
    int n;
    cin>>n;
    int arr[n];
    for(int i=0;i < n;i++)
        cin>>arr[i];
    search(arr, 0, n-1);
    return 0;
}
