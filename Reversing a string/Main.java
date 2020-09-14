#include <iostream>
#include <cstring>
int main()
{
    char str[100], rev[100];
	std::cin.getline(str, 100);
    int size = std::strlen(str);
    for(int i = size-1, x =0;i >=0;--i,x++){
        rev[x] = str[i];
    }
    std::cout<<rev;
}