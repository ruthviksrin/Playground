#include<iostream>
using namespace std;

void merging(int arr[], int low, int mid, int high){
	int i, j, k;
  	int n_1 = mid-low+1;
  	int n_2 = high - mid;
  	int left[n_1], right[n_2];
  	for(i=0;i<n_1;++i)
      	left[i] = arr[i +low];
  	for(j=0;j<n_2;++j)
      	right[j] = arr[j+1+mid];
  	i=0, j=0, k=low;
  	while(i<n_1 && j<n_2){
    	if(left[i] <= right[j]){
        	arr[k] = left[i];
          	i++;
        }
      	else{
        	arr[k] = right[j];
          	j++;
        }
      	k++;
    }
  		while(i < n_1){
        	arr[k] = left[i];
          	i++;
          	k++;
       }
  		  while(j < n_2){
        	arr[k] = right[j];
          	j++;
          	k++;
       }
}
void merge_sort(int arr[], int low, int high){
    if(low < high){
        int mid = (low + high)/2;
        //Dividing
        merge_sort(arr, low, mid);
        merge_sort(arr, mid+1, high);
        //Conquering
        merging(arr, low, mid, high);
    }
}

int main(){
    int size{};
    cin>> size;
    int arr[size];
    for(int i{0};i<size;++i)
        cin>> arr[i];
    cout<<"Before Sort:"<<endl;
    for(int i{0};i<size;++i)
        cout << arr[i]<< " ";
    cout<< endl;
    merge_sort(arr, 0, size-1);   
    cout<<"After Sort:"<< endl;
    for(int i{0};i<size;++i)
        cout << arr[i]<< " ";
    return 0;
}