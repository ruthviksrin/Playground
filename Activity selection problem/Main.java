#include<iostream>
#include<algorithm>
using namespace std;
typedef struct Activity{
	int start, finish;
}Activity;
void max_activity(Activity arr[], int n){
    int i{0};
  	cout << i<<" ";
    for(int j{1};j<n;j++){
        if(arr[j].start >= arr[i].finish){
            cout<<j<<" ";
      		i=j;
        }
    }
}

int main(){
  	int n;
  	cin >> n;
  	Activity arr[n];
  	for(int i{0};i < n;i++){
    	cin >> arr[i].start;
    }
   	for(int i{0};i < n;i++){
    	cin >> arr[i].finish;
    }
  	max_activity(arr, n);
  	return 0;
}
/*void printMaxActivities(int s[], int f[], int n) 
{ 
    int i, j; 
  
    // The first activity always gets selected 
    i = 0; 
    cout << i<< " " ; 
  
    // Consider rest of the activities 
    for (j = 1; j < n; j++) 
    { 
      // If this activity has start time greater than or 
      // equal to the finish time of previously selected 
      // activity, then select it 
      if (s[j] >= f[i]) 
      { 
          cout << j << " " ; 
          i = j; 
      } 
    } 
} 
  
// driver program to test above function 
int main() 
{ 
    int n;
  	cin >> n;
   	int s[n], f[n];
  	for(int i=0;i < n;i++){
    	cin >> s[i];
    }
   	for(int i=0;i < n;i++){
    	cin >> f[i];
    }
    printMaxActivities(s, f, n); 
    return 0; 
} 
*/