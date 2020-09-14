#include <iostream> 
using namespace std;
int josephus(int n,int k){ 
	int result=0; //for n=1 
	for(int i=2;i<=n;i++) 
		result=(k+result)%i; 
	return (result+1);  //adding 1 to change indexing; 
} 
int main(){ 
    int n ,k;
  	cin>> n>>k;
    cout << josephus(n, k); 
    return 0; 
} 