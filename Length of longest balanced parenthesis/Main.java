#include<iostream>
#include<cstring>
#include<stack>
using namespace std;
int MaxLenBalanceParan(char *str){
    stack<int> stack;
    stack.push(-1);
    int max_len = 0;
    for(int i=0;i < strlen(str);i++){
        if(str[i]=='('){
            stack.push(i);
        }
        else{
            stack.pop();
            if(stack.empty()){
                stack.push(i);
                continue;
            }
            int curr_len = i- stack.top();
            if(max_len < curr_len)
                max_len = curr_len;
        }
    }
    return max_len;
}
int main(){
    char str[40];
    cin>>str;
    cout<<MaxLenBalanceParan(str);
    return 0;
}