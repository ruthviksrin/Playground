#include<iostream>
using namespace std;

int edit_distance(string X, string Y, int len1, int len2){
    int list[len1+1][len2+1];
    for(int i=0;i <= len1;i++){
        for(int j=0;j <= len2;j++){
            if(i==0)
                list[i][j] = j;
            else if(j==0)
                list[i][j] = i;
            else if(X[i-1] == Y[j-1])
                list[i][j] = list[i-1][j-1];
            else
                list[i][j] = 1+min(list[i-1][j-1], min(list[i-1][j], list[i][j-1]));
        }
    }
    return list[len1][len2];
}

int main(){
    string X, Y;
    cin>>X>>Y;
    cout<<edit_distance(X, Y, X.length(), Y.length())<<endl; 
    return 0;
}
