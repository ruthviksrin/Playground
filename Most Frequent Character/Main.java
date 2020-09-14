#include<iostream>
#include<unordered_map>
#include<vector>
#include<algorithm>
using namespace std;

int max_freq_char(string str){
    // C++ program for the above approach 
    //Define an unordered_map
    vector<int> v;
    unordered_map<char, int> M;
	// Traverse string str check if current character is present or not 
	for (int i = 0; str[i]; i++){ 
		// If the current characters is not found then insert current characters with frequency 1 
		if (M.find(str[i]) == M.end()){ 
			M.insert(make_pair(str[i], 1)); 
		} 
		// Else update the frequency 
		else { 
			M[str[i]]++; 
		} 
	} 
	// Traverse the map to print the frequency 
	for (auto& it : M) { 
			v.push_back(it.second); 
	}
    return *max_element(v.begin(), v.end());
} 


int main(){
     string str;
     cin>>str;
     cout<<max_freq_char(str)<<endl;
    return 0;
}