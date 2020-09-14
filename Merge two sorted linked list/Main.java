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
Node *newNode(int x){
    Node *temp;
    temp ->data = x;
    temp ->next = NULL;
    return temp;
}
void print_list(Node **head){
    Node *temp = *head;
    while(temp != NULL){
        cout<<temp->data<<"->";
        temp = temp->next;
    }
}
Node* merge_lists(Node* a, Node* b)  
{  
    Node* result = NULL;  
      
    /* Base cases */
    if (a == NULL)  
        return(b);  
    else if (b == NULL)  
        return(a);  
    if ((a)->data <= (b)->data)  
    {  
        result = a;  
        result->next = merge_lists(a->next, b);  
    }  
    else
    {  
        result = b;  
        result->next = merge_lists(a, b->next);  
    }  
    return(result);  
}  
int main(){
    Node *head1 = NULL;
    Node *head2 = NULL;
    int size1, size2;
    int x;
    cin>>size1;
    for(int i=0;i < size1;i++){
        cin>>x;
        append(&head1, x);
    }
    cin>>size2;
    for(int i=0;i < size2;i++){
        cin>>x;
        append(&head2, x);
    }
    Node *head = merge_lists(head1, head2);
    print_list(&head);
    cout<<"NULL"<<endl;
    return 0;
}