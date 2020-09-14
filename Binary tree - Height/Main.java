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
            if(temp->data >= value){
                if(temp->left ==NULL){
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

void inorder_traversal(Node *node){
    if(node==NULL) return;

    inorder_traversal(node->left);
    cout<< node->data <<" ";
    inorder_traversal(node->right);
}

int height(Node *node){
    if(node == NULL) return 0;
    return 1+ max(height(node->left), height(node->right));
}

int diameter(Node *root){
    if(root==NULL) return 0;

    int lheight = height(root->left);
    int rheight = height(root->right);

    int ldiameter = diameter(root->left);
    int rdiameter = diameter(root->right);

    return max(1+lheight+rheight , max(ldiameter, rdiameter));
}
int main(){
    Node *root = NULL;
    int value;
    bool check = true;
    while(check){
        cin>>value;
        if(value>=0)
            insert(&root, value);
        else
            check = false;
    }
    cout<<"Height of the tree is "<<height(root)<<endl;
    return 0;
}