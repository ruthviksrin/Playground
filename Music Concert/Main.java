#include<iostream>
#include<cstdlib>
int main(){
  	int n{}, male{0}, female{0};
  	std::cin >> n;
  	int *ptr = (int *)malloc(n*sizeof(int));
  	for(int i{0};i < n ;++i)
    	std::cin >> *(ptr+i);
  	for(int i{0};i< n;++i){
    	if(*(ptr+i)%2==0)
          	female += 1;
      	else
          	male += 1;
     }
     std::cout<<male<<std::endl;
     std::cout<<female<<std::endl;
     free(ptr);
     return 0;
}