#include<iostream>
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
        cout<<temp->data<<" ";
        temp = temp->next;
    }
}

void swap_nodes(Node **head, int p, int q){
    if(p ==q) return;
    Node *prevP = NULL, *currP = *head;  
    while (currP && currP->data != p){  
        prevP = currP;  
        currP = currP->next;  
    }  
    // Search for y (keep track of prevY and CurrY  
    Node *prevQ = NULL, *currQ = *head;  
    while (currQ && currQ->data != q){  
        prevQ = currQ;  
        currQ = currQ->next;  
    }  
    // If either x or y is not present, nothing to do  
    if (currP == NULL || currQ == NULL)  
        return;  
    if (prevP != NULL)  
    prevP->next = currQ;  
    else // Else make y as new head  
        *head = currQ;  
    
    // If y is not head of linked list  
    if (prevQ != NULL)  
        prevQ->next = currP;  
    else // Else make x as new head  
        *head = currP;  
    
    // Swap next pointers  
    Node *temp = currQ->next;  
    currQ->next = currP->next;  
    currP->next = temp;  
}
int main(){
    Node *head = NULL;
    int size, x;
    cin>>size;
    for(int i{0};i < size;i++){
        cin>>x;
        append(&head, x);
    }
    int p , q;
    cin>> p>>q;
    swap_nodes(&head, p, q);
    print_list(&head);
    return 0;
}