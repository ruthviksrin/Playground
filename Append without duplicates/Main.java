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

bool search(Node** head, int x)  
{  
    Node* current = *head; // Initialize current  
    while (current != NULL)  
    {  
        if (current->data == x)  
            return true;  
        current = current->next;  
    }  
    return false;  
}      
int main(){
    Node *head = NULL;
    int size{0};
    int x;
    bool check = true;
    while(check){
        cin>>x;
        if(x >=0){
            if(!(search(&head, x))){
                append(&head, x);
                size++;
            }
        }
        else{
            check = false;
        }
    }
  	if(size==0){
    	cout<<"List is empty"<<endl;
    }
  	else{
      print_list(&head);
    }
    return 0;
}