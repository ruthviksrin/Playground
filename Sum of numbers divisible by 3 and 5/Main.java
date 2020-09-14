#include<iostream>
using namespace std;

 int SumNumbersDivisible(int m, int n){
  	int sum{0};
    for(int i{m};i < n;++i){
        if((i%3==0) &&(i%5==0))
           sum += i;
        }
   	return sum;
 }

int main()
{
  	int m , n, sum{};
  	cin >> m >> n;
  	sum = SumNumbersDivisible(m, n);
  	cout << sum << endl;
  	return 0;
}