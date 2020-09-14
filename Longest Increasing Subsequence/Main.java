#include<iostream>
#include<algorithm>
using namespace std;

int lis(int arr[], int size){
    int list[size];
    list[0] = 1;
    for(int i=1;i < size;i++){
        list[i] = 1;
        for(int j=0;j < i;j++){
            if(arr[i]>arr[j] && list[i]< list[j]+1){
                list[i] = list[j]+1;
            }
        }
    }
    return *max_element(list, list+size);
}

int main()
{
    int size;
    cin>>size;
    int arr[size];
    for(int i=0;i < size;i++)
        cin>>arr[i];
    
    cout<<lis(arr, size)<<endl;
    return 0;
}
