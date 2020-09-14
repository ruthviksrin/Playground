#include <iostream>
#include <cmath>
using namespace std;

int main(){
	int m,n,req, prod;
  	cin >> m >> n >> req;
	prod = pow(m, n);
     if(prod < req)
	 	cout <<"Sorry Doctor! You need more bacteria."<< endl;
  	else
      cout << "Doctor, you can proceed with your experiment."<< endl;
    return 0;
}