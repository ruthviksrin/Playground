#include<iostream>
using namespace std;

int digSum(int z){
    if(z<=9)
        return z;
    int sum{0}, m{0};
    while(z!=0){
        m=z%10;
        sum += m;
        z /= 10;
    }
    return digSum(sum);
}

int main(){
	int a{};
  	cin >> a;
  	cout << digSum(a)<< endl;
	return 0;
}