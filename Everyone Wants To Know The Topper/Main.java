#include<iostream>
int main()
{
	int n{}, max{0};
  	std::cin>> n;
  	int arr[n];
  	for (int i{0};i < n;++i){
    	int mark;
      	std::cin >> mark;
      	arr[i] = mark;
    }
  	for (int i{0};i < n;++i){
    	if(max < arr[i])
          	max = arr[i];
    }
  	std:: cout << max << std::endl;
  	return 0;
}