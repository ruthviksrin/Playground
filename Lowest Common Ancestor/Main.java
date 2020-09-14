#include<iostream>
using namespace std;
typedef struct Node{
    int data;
    Node *right, *left;
}Node;
void insert(Node **root, int value){
    Node *temp = *root;
    Node *newnode = new Node;
    newnode->data = value;
    newnode->left = newnode->right = NULL;
    if(*root==NULL){
        *root = newnode;
        return;
    }
    else{
        while(1){
            if(value <= temp->data){
                if(temp->left==NULL){
                    temp->left = newnode;
                    return;
                }
                temp = temp->left;
            }
            else{
                if(temp->right==NULL){
                    temp->right=newnode;
                    return;
                }
                temp = temp->right;
            }
        }
    }
    return;
}

int lowest_common_ancestor(Node *root, int m, int n){
    while(root!=NULL){
        if(root->data>m && root->data>n){
            root = root->left;
        }
        else if(root->data < m && root->data < n){
            root= root->right;
        }
        else break;
    }
    return root->data;
}
bool check_element(int arr[], int size, int m){
	for(int i=0;i < size;i++){
    	if(arr[i]==m)
        	return true;
    }
  	return false;
}
int main(){
    Node *root = NULL;
    int size, value, m, n, zero=-1;
    cin>>size;
  	int arr[size];
    for(int i=0;i < size;i++){
        cin>>value;
        insert(&root, value);
      	arr[i] = value;
    }
    cin>>m>>n;
  	if(check_element(arr, size, m) && check_element(arr, size, m)) 
    	cout<<lowest_common_ancestor(root, m, n)<<endl;
  	else
      	cout<<zero<<endl;
    return 0;
}