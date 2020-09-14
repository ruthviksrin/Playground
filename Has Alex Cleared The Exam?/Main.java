#include<iostream>
using namespace std;

bool test_check(int n, int arr[], int al){
	for(int i{0};i < n;++i){
    	if(arr[i] == al)
          	return true;
    }
    return false;
}

int main()
{
  	int n{}, al{};
  	cin >> n;
  	int arr[n];
  	for(int i{0};i < n;++i){
    	int a{};
      	cin >> a;
      	arr[i] = a;
    }
  	cin >> al;
  	if(test_check(n, arr, al))
      	cout << "She passed her exam"<< endl;
  	else
      	cout << "She failed"<< endl;
	return 0;
}