#include<iostream>
int findPeri(int app){
    int x[] = {-1, -1, -1, 0, 0, 1, 1, 1};
  	int y[] = {-1, 0, 1, -1, 1, -1, 0, 1};
  	for(int i{0};i < 8;i++){
    	x[i]<0? (x[i]*=-1):x[i];
      	y[i]<0? (y[i]*=-1):y[i];
    }
    int sum{0}, factor{1};
    while(sum < app){
        for(int i{0};i < 8;++i)
            sum += x[i]+y[i];
        if(sum >= app) break;
        factor++;
        for(int i{0};i < 8;++i){
            x[i]*= factor;
            y[i]*= factor;
        }
    }
    return factor << 3;
}

int main(){
    int app{};
    std::cin >> app;
    std::cout << findPeri(app) << std::endl;
    return 0;
}