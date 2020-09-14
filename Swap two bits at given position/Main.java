#include<iostream>
#include<bitset>
using namespace std;

int swap_bits(int n, int p1, int p2){
	unsigned int bit1 =  (n >> p1) & 1; 
  
    /* Move p2'th to rightmost side */
    unsigned int bit2 =  (n >> p2) & 1; 
  
    /* XOR the two bits */
    unsigned int x = (bit1 ^ bit2); 
  
    /* Put the xor bit back to their original positions */
    x = (x << p1) | (x << p2); 
  
    /* XOR 'x' with the original number so that the 
       two sets are swapped */
    unsigned int result = n ^ x; 
	return result;
}
int main(){
    int n, p1, p2;
    cin>>n>>p1>>p2;
    cout<<swap_bits(n, p1, p2)<<endl;
  	cout<<bitset<8>(n)<<endl;
    return 0;
}