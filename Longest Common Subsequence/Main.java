#include<iostream>
using namespace std;

int lcs(string X, string Y, int len1, int len2){
    int mat[len1+1][len2+1];
    for(int i=0;i<=len1;i++){
        mat[i][0] = 0;
    }
    for(int j=0;j <= len2;j++){
        mat[0][j] = 0;
    }
    for(int i=1;i <= len1;i++){
        for(int j=1;j <= len2;j++){
            if(X[i-1]==Y[j-1]){
                mat[i][j] = 1+mat[i-1][j-1];
            }
            else{
                mat[i][j] = max(mat[i][j-1], mat[i-1][j]);
            }
        }
    }
    return mat[len1][len2];
}

int main(){
    string X, Y;
    cin>>X>>Y;
    cout<<lcs(X, Y, X.length(), Y.length())<<endl;
    return 0;
}