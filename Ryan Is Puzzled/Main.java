#include<iostream>
using namespace std;

int main()
{
	int r{}, c{};
	cin >> r >> c;
  	int arr[r][c]; 
   	int arr_t[c][r];
  	for(int i{};i < r;++i){
    	for (int j{};j < c;++j)
          	cin >> arr[i][j];
    }
  	for(int i{};i < r;++i){
    	for (int j{};j < c;++j)
          	arr_t[j][i] = arr[i][j];
    }
  	for(int i{};i < c;++i){
    	for (int j{};j < r;++j)
          	cout << arr_t[i][j]<< " ";
      	cout << endl;
    }
  	return 0;
}	