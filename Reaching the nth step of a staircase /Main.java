#include<iostream>
using namespace std;
int fib(int n)
{
  if(n<=1)
     return n;
  return fib(n-1)+fib(n-2);
}  
int countWays(int s)
{
   return fib(s+1);
}
int main ()
{
 	int steps;
 	cin>>steps;
 	cout<<countWays(steps);
 	return 0;
}