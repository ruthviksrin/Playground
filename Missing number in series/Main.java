#include<iostream>
using namespace std;

int main(){
    int n{};
    cin>>n;
    int arr[n];
    for(int i{0};i < n;++i)
        cin >> arr[i];
    int d = (arr[n-1] - arr[0]) / n;

    int low{0}, high{n-1};
    while(low < high){
        int mid = low + (high-low)/2;
        if(low+1 == high){
            cout << (arr[low]+arr[high])/2;
          	break;
        }          
        if(arr[mid] == arr[0]+ mid*d)
            low = mid;
        else
            high = mid;
    }
    return 0;
}
