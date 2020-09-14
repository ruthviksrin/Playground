#include<iostream>
#include<cmath>
using namespace std;
int count_digits(long int n){
	int count{0};
  	while(n>0){
    	n = n/10;
      	count++;
    }
  	return count;
}
bool armstrong(long int n){
	long int sum {0};
    int digit, dig = count_digits(n);
    long int temp = n;
  	while(temp){
    	digit = temp%10;
        sum += pow(digit ,dig);
        temp /= 10;
    }
    return (sum == n);
}

int main(){
	long int n{};
  	cin >> n;
    if((n>=1)&&(n<= pow(10,10))){
        if(armstrong(n))
            cout << "Yes"<< endl;
        else
            cout << "No"<< endl;
    }
  	return 0;
}