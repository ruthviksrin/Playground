#include<iostream>
#include <cmath>
using namespace std;
long long digSum(long long n) 
{ 
    int sum = 0; 
    while(n > 0 || sum > 9){ 
        if(n == 0) { 
            n = sum; 
            sum = 0; 
        } 
        sum += n % 10; 
        n /= 10; 
    } 
    return sum; 
} 
int main()
{
	long int n{};
  	cin >> n;
  	if((n >= 1) && (n <= pow(10,10)))
    	cout << digSum(n) << endl;
	return 0;
}