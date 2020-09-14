#include<iostream>
#include<cmath>
using namespace std;
int main()
{
 	long long n{}, sum{};
  	cin >> n;
  	if((n>=1)&&(n <= pow(10,16))){
  		sum = (n*(n+1))/2;
  		cout << sum << endl;
    }
    else
    	cout <<"Not in range"<< endl;
    return 0;
}