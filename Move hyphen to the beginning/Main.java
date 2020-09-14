#include<iostream>
#include<string>
using namespace std;

void move_hyphen(string &str){
    // Traverse from end and swap spaces 
    int i = str.size()-1; 
    for (int j = i; j >= 0; j--){
        if (str[j] != '-'){ 
            swap(str[i--], str[j]);
        }
    } 
}
int main(){
    string str;
    cin>>str;
    move_hyphen(str);
    cout<<str<<endl;
    return 0;
}