#include<iostream>
#include<vector>
using namespace std;
vector<int> arr;
typedef struct Node{
    int data;
    Node *right, *left;
}Node;

void insert(Node **root, int value){
    Node *newnode = new Node;
    Node *temp = *root;
    newnode->data = value;
    newnode->left = NULL;
    newnode->right = NULL;
    if(*root==NULL){
        *root = newnode;
    }
    else{
        while(1){
            if(temp->data >= value){
                if(temp->left == NULL){
                    temp->left = newnode;
                    return;
                }
                temp = temp->left;
            }
            else{
                if(temp->right == NULL){
                    temp->right = newnode;
                    return;
                }
                temp = temp->right;
            }
        }
    }
    return;
}

void inorderTraversal(Node *node){
    if(node==NULL){
        return;
    }
    inorderTraversal(node->left);
    arr.push_back(node->data);
    inorderTraversal(node->right);
}

int main(){
    Node *root=NULL;
    int value;
    bool check=true;
    while(check){
        cin>>value;
        if(value >= 0)
            insert(&root, value);
        else
            check = false;
    }
    int k;
    cout<<"Enter the kth value: ";
    cin>>k;
    inorderTraversal(root);
    cout<<"\nSmallest kth value "<< arr[k-1]<<endl;
    return 0;
}