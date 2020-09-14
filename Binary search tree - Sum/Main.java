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
    if(*root ==NULL)
        *root = newnode;
    else{
        while(1){
            if(value <= temp->data){
                if(temp->left == NULL)
                {
                    temp->left = newnode;
                    return;
                }
                temp =temp->left;
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

int sum_of_nodes(Node *root){
    if(root==NULL) return 0;
    return (root->data+sum_of_nodes(root->left)+sum_of_nodes(root->right));
}

int main(){
    Node *root = NULL;
    int value;
    bool check = true;
    while(check){
        cin>>value;
        if(value >= 0)
            insert(&root, value);
        else
            check = false;
    }
    cout<< "Sum of all nodes are "<<sum_of_nodes(root)<<endl;
    return 0;
}