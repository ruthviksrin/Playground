#include<iostream>
int fact(int x){
	int s{};
  	if(x <= 1){
      	return 1;
    }
  	s = x*fact(x-1);
  	return s;
}
int main()
{
  	int a{}, f{};
	std::cin >> a;
  	f = fact(a);
 	std::cout << "The factorial of "<<a<<" is "<<f<<std::endl; 	
}