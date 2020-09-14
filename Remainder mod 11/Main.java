#include <iostream>
#include<cmath>
using namespace std;

int main(){	
  	string str;
    int n = 0;
  	cin>>str;
    int len = str.size();
    for(int i = 0;i < len;i++){
        n = n + ((str[i]-'0')*pow(10, i));
    }
    cout<<(n%11)<<endl;
    return 0;
}