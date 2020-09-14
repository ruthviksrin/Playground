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
        cout<<temp->data<<"\n";
        temp = temp->next;
    }
}
void removeDuplicates(struct Node **head) 
{ 
    struct Node *ptr1, *ptr2, *dup; 
    ptr1 = *head; 
    while (ptr1 != NULL && ptr1->next != NULL) 
    { 
        ptr2 = ptr1; 
        while (ptr2->next != NULL) 
        { 
            /* If duplicate then delete it */
            if (ptr1->data == ptr2->next->data) 
            { 
                /* sequence of steps is important here */
                dup = ptr2->next; 
                ptr2->next = ptr2->next->next; 
                delete(dup); 
            } 
            else /* This is tricky */
                ptr2 = ptr2->next; 
        } 
        ptr1 = ptr1->next; 
    } 
}
int main(){
    Node *head = NULL;
    int size{0};
    int x;
    bool check = true;
    while(check){
        cin>>x;
        if(x >=0){
            append(&head, x);
            size++;
        }
        else{
            check = false;
        }
    }
    cout<<"Linked list before removal of duplicates"<<endl;
    print_list(&head);
    removeDuplicates(&head);
    //delete_at_start(&head);
    cout<<"Linked list after removal of duplicates"<<endl;
    print_list(&head);
    return 0;
}