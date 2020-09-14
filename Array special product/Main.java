#include<iostream>
using namespace std;
int* ArrProd(int arr[], int n){
    static int prod_arr[10];
    for(int i{0};i < n;++i){
        int prod = 1;
        for(int j{0};j < n;j++)
            if(j != i)
                prod *= arr[j];
        prod_arr[i] = prod; 
    }
    return prod_arr;
}
int main(){
    int n{}, *prod;
    cin >> n;
    int arr[n];
    for(int i{0};i < n;i++)
        cin >> arr[i];
    prod = ArrProd(arr, n);
    for(int i{0};i < n;i++)
        cout << prod[i]<< endl;
    return 0;
}