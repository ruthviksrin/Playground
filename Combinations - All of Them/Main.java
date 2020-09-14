#include<bits/stdc++.h>
using namespace std;
void combine(int arr[], int n, int selected[], int used){
    if(used==n){
        int i;
        for(i=0;i<n;++i)
            if(selected[i]==1)
                cout<< arr[i]<<",";
            cout<<endl;
        return;
    }
    selected[used] = 1;
    combine(arr,n,selected,used+1);
    selected[used] = 0;
    combine(arr,n,selected,used+1);
}

void combination_wrapper(int arr[], int n){
    int selected[n], used{0};
    combine(arr, n, selected, used);
}
int main(){
  	int N{};
  	cin>> N;
	int arr[N];
    for(int i{0};i<N;++i)
  		cin >> arr[i];
    combination_wrapper(arr, N);
    return 0;
}