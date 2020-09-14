#include<iostream>
#include <vector>
#include <cmath>
using namespace std;
int catchingTheives(char arr[], int n, int k){
    int count= 0;
    vector<int> police;
    vector<int> theives;
    for(int i{0};i < n;i++){
        if(arr[i]=='P')
            police.push_back(i);
        else
            theives.push_back(i);        
    }
    int l=0, r=0;
    while(l < police.size() && r < theives.size()){
        if(abs(police[l]-theives[r])<=k){
            count++;
            l++;
            r++;
        }
        else if(police[l] < theives[r])
            l++;
        else
            r++;
        
    }
    return count;
}

int main(){
    int n, k;
    cin >> n;
    char arr[n];
    for(int i{0};i < n;i++){
        cin >> arr[i];
    }
    cin >> k;
    cout<<"Maximum thieves caught: " <<catchingTheives(arr, n, k)<< endl;
    return 0;
}