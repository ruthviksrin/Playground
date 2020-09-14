#include<iostream>
using namespace std;
int main()
{
	int r{}, c{};
  	cin >> r >> c;
  	int mat1[r][c], mat2[r][c], sum[r][c];
  	for(int i{0};i< r;++i){
    	for(int j{0};j < c;++j){
        	int a{};
          	cin >> a;
          	mat1[i][j] = a;
        }  	
    }
  	for(int i{0};i< r;++i){
    	for(int j{0};j < c;++j){
        	int a{};
          	cin >> a;
          	mat2[i][j] = a;
        }  	
    }
  	for(int i{0};i< r;++i){
    	for(int j{0};j < c;++j){
          	sum[i][j] = mat1[i][j]+ mat2[i][j];
        }  	
    }
  	for(int i{0};i< r;++i){
    	for(int j{0};j < c;++j){
          	cout <<sum[i][j]<< " ";
        }
      	cout << endl; 
    }
  	return 0;
}