#include<iostream>
using namespace std;
int max_value(int x, int y){
	return (x > y)? x:y;
}
int max_stealing(int arr[], int N, int i){
	if(i >=N)
      	return 0;
  	else
    	return max_value((arr[i]+max_stealing(arr,N,i+2)),max_stealing(arr,N,i+1));
}

int main(){
	int N;
  	cin >> N;
  	int arr[N];
  	for(int i{0};i < N;++i)
      	cin >> arr[i];
	int result = max_stealing(arr, N,0);
  	cout << result;
  	return 0;
}