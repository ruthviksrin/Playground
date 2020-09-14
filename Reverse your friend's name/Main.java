#include<iostream>
#include<string>
int main() 
{ 
	std::string name, rev;
  	std::getline(std::cin, name);
  	rev = std::string(name.rbegin(),name.rend());
  	std::cout << rev << std::endl;
  	return 0;
}