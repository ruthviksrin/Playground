#include<iostream>
#include<string>
#include<unordered_map>
using namespace std;

// char *remove_duplicates(char *s, int n){ 
//   unordered_map<char,int> exists; 
//   int index = 0;
//   for(int i=0;i<n;i++){ 
//     if(exists[s[i]]==0) 
//     { 
//       s[index++] = s[i]; 
//       exists[s[i]]++; 
//     } 
//   } 
//   return s; 
// } 

char *remove_duplicates(char *str, int n){ 
 int index = 0;    
   // Traverse through all characters 
   for (int i=0; i<n; i++) { 
     // Check if str[i] is present before it   
     int j;   
     for (j=0; j<i; j++)  
        if (str[i] == str[j]) 
           break; 
     // If not present, then add it to 
     // result. 
     if (j == i) 
        str[index++] = str[i]; 
   } 
  return str; 
} 
int main(){
    char str[30];
    cin>>str;
    int n = sizeof(str)/sizeof(str[0]);
    cout<<remove_duplicates(str, n)<<endl;
    return 0;
}