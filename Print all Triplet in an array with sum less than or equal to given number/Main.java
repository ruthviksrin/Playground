// C++ program to print triplets with sum smaller 
// than a given value 
#include <bits/stdc++.h> 
using namespace std; 

int printTriplets(int arr[], int n, int sum) 
{ 
	// Sort input array 
	sort(arr, arr + n); 

	// Every iteration of loop counts triplet with 
	// first element as arr[i]. 
	for (int i = 0; i < n - 2; i++) { 

		// Initialize other two elements as corner 
		// elements of subarray arr[j+1..k] 
		int j = i + 1, k = n - 1; 

		// Use Meet in the Middle concept 
		while (j < k) { 

			// If sum of current triplet is more or equal, 
			// move right corner to look for smaller values 
			if (arr[i] + arr[j] + arr[k] > sum) 
				k--; 

			// Else move left corner 
			else { 

				// This is important. For current i and j, 
				// there are total k-j third elements. 
				for (int x = j + 1; x <= k; x++) 
					cout << "("<<arr[i] << ", " << arr[j] 
						<< ", " << arr[x]<<")" << endl; 
				j++; 
			} 
		} 
	} 
} 

// Driver program 
int main() 
{ 
	int n, sum; 
 	cin>>n;
  	int arr[n];
  	for(int i = 0;i < n;i++)
      	cin>>arr[i];
 	cin>>sum;
	printTriplets(arr, n, sum); 
	return 0; 
} 
