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
    newnode->left = NULL;
    newnode->right = NULL;
    if(*root == NULL){
        *root = newnode;
        return;
    }
    while(1){
        if(value <= temp->data){
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
    return;
}
void inorder_traversal(Node *root){
    if(root==NULL) return;
    inorder_traversal(root->left);
    cout<<root->data<<" ";
    inorder_traversal(root->right);
}

void sum_of_leaves(Node *root, int &sum){
    if(!root) return;
    if(!root->left && !root->right){
        sum += root->data;
        }
    sum_of_leaves(root->left, sum);
    sum_of_leaves(root->right, sum);
}
int main(){
    Node *root=NULL;
    int value;
    int check=true;
    while(check){
        cin>>value;
        if(value>=0)
            insert(&root, value);
        else
            check=false;
    }
    int sum = 0; 
    sum_of_leaves(root, sum);
    cout<<"Sum of all leaf nodes are "<<sum<<endl;
    return 0;
}