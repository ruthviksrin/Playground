#include<iostream>
int main()
{
    int a,b,c,gcd1,res,ans;
    std::cin>>a>>b>>c>>ans;
   	int small{9999999};
  	if (small > a)
      small = a;
  	if (small > b)
      small = b;
   	if (small > c)
      small = c;
  	while(small != 0){
    	if((a%small == 0)&&(b%small == 0)&&(c%small == 0)){
        	gcd1 = small;
      		break;
    	}
		else
          small--;
    }
  	if(gcd1 == ans)
    	std::cout<< "Answer is correct."<< std::endl;
    else
    	std::cout<< "Answer is wrong."<< std::endl;
}