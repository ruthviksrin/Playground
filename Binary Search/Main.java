#include<iostream>
using namespace std;
int binarySearch(int array[], int x, int low, int high) {
  if (high >= low) {
    int mid = low + (high - low) / 2;

    // If found at mid, then return it
    if (array[mid] == x)
      return mid;

    // Search the left half
    if (array[mid] > x)
      return binarySearch(array, x, low, mid - 1);

    // Search the right half
    return binarySearch(array, x, mid + 1, high);
  }

  return 0;
}
int main() {
    int size{}, ele{};
    cin>> size;
    int arr[size];
    for(int i{0};i<size;++i)
        cin>> arr[i];
    cin>> ele;
    int result =  binarySearch(arr, ele, 0, size-1);
  	if(result == 0)
      	cout << "Not found"<< endl;
 	else
      	cout << result << endl;
    return 0;
}