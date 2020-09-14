#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    int count{0}, temp{n}, sum{0}, test{0};
  	while(temp != 0){
    	temp /=10;
      	count++;
    }
  	temp = n;
  	while(temp != 0){
    	int digit = temp % 10;
      	sum = sum + power(digit, count);
      	temp = temp / 10;
    }
  	if (sum == n)
    	test = 1;
  	else
      	test=0;
  	return test;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}