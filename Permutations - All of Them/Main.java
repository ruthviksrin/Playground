#include <iostream>
#include<cstring>
using namespace std;
# define MAXSIZE 20

void sort(char str[], int n){   
    int i,j;
    for(i=1;i < n;++i){
        int temp = str[i];
        for(j=i-1;j>=0;--j){
            if(str[j+1]<str[j])
                str[j+1] = str[j];
            else
                break;
        }
        str[j+1] = temp;
    }
}

void permute(char str[], int n, int selected[], int used[],int index){
    int i;
    if(index==n){
        for(i=0;i<n;++i)
            cout << char(selected[i]);
        cout<< endl;
        return;
    }
    for(i=0;i<n;i++){
        if(used[i]==1)
            continue;
        used[i] = 1;
        selected[index] = str[i];
        permute(str, n, selected, used, index+1);
        used[i] =0;
    }
}

void permutation_wrapper(char str[], int n){
    sort(str, n);
    int selected[MAXSIZE] = {},used[MAXSIZE] = {};
    permute(str, n, selected, used, 0);
}

int main(){
    char str[MAXSIZE];
    cin >> str;
    permutation_wrapper(str, strlen(str));
    return 0;
}