#include<iostream>
using namespace std;
int digitsum(int i){
    int sum{0};
    while(i!=0){
        sum += (i%10);
        i /= 10;
    }
    return sum;
}

int AllnumDiff(int n, int D){
    int low= 1, high= n;
    while(low <= high){
        int mid = (low + high)/2;
        if((n-digitsum(n)) < D)
            low = mid + 1;
        else
            high = mid -1;
         
    }
    return (n-high);
}
int main(){
    int n, D;
    cin >> n>> D;
    if(n>=1 && n<= 100000 && D>=1 && D<= 10000){
            int count{0};
            for(int i{1};i<=n;i++)
                if((i - digitsum(i)) >= D)
                    count++;
            cout << count << endl;
        }
    
    return 0;
}