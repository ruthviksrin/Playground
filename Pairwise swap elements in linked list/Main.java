#include<iostream>
#include<algorithm>
using namespace std;

typedef struct Node{
    int data;
    Node *next;
}Node;

void append(Node **head, int x){
    Node *newnode = new Node;
    Node *last = *head;
    newnode->data = x;
    newnode->next = NULL;
    if(*head == NULL)
        *head = newnode;
    else{
        while(last->next != NULL){
            last = last->next;
        }
        last->next = newnode;
    }
}
void print_list(Node **head){
    Node *temp = *head;
    while(temp != NULL){
        cout<<temp->data<<endl;
        temp = temp->next;
    }
}

void pairwiseSwap(Node *head){
    Node *temp = head;
    if(head == NULL){
        cout<<"List is empty";
        return;
    }
    while(temp!=NULL && temp->next!=NULL){
        swap(temp->data, temp->next->data);
        temp = temp->next->next;
    }
}
int main(){
    Node *head = NULL;
    int x;
    bool check{true};
    while(check){
        cin >> x;
        if(x>=0){
            append(&head, x);
        }
        else{
            check =false;
        }
    }
    pairwiseSwap(head);
    print_list(&head);
    return 0;
}