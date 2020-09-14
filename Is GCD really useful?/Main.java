#include<iostream>
#include <cmath>
using namespace std;
int gcd(long a, long b){
	if(b==0)
      	return a;
  	return gcd(b, a%b);
}

int main()
{
	int a{}, b{};
  	cin >> a>> b;
  	if((a>=1) && (a<= pow(10,16)) && (b>=1) && (b<= pow(10,16)))
    	cout << gcd(a,b)<< endl;
	return 0;
}	