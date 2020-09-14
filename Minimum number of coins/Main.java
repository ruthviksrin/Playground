#include<iostream>
#include<algorithm>
using namespace std;
void count_min_coins(int arr[], int n, int k){
	sort(arr, arr+n, [](int x1, int x2){ return x1>x2;});
  	int ans[n];
  	int count{0};
  	for(int i{0};i < n;i++){
    	while(k >= arr[i]){
        	k -= arr[i];
          	ans[count] = arr[i];
          	count++;
        }
      	if(k == 0)
          	break;
    }
  	for(int i{0};i <count;i++){
    	cout << ans[i] << "  ";
    }
}

int main()
{
    int arr[] = {1, 2, 5, 10, 20, 50, 100, 500, 1000};
  	int amount;
    cin >> amount;
    int n = sizeof(arr)/sizeof(arr[0]);
  	count_min_coins(arr, n, amount);
    return 0;
}