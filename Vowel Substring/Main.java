#include<iostream>
#include<string>
#include<set>
using namespace std;
bool isVowel(char x){  return (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'); } 
int vowel_substring(string str){ 
    int count{0}; 
    set<char> hash;
    int n = str.length(); 
    for (int i = 0; i < n; i++) { 
       for (int j = i; j < n; j++) { 
            if (isVowel(str[j]) == false) 
              break; 
            hash.insert(str[j]);  
            if (hash.size() == 5){ 
                count++;
            }
        } 
        hash.clear(); 
    }
    return count;
} 

int main(){
    string str;
    cin>>str;
    cout<<vowel_substring(str)<<endl;
    return 0;
}