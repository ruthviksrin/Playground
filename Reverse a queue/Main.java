#include<iostream>
using namespace std;
typedef struct Node Node;
struct Node{
    int data;
    Node *next;
}*front{NULL}, *rear{NULL};

void enqueue(int x){
    Node *newnode = new Node;
    Node *temp = front;
    newnode->data = x;
    newnode->next = NULL;
    if(front == NULL){
        front = newnode;
        rear = newnode;
    }
    else{
        while(temp->next != NULL)
            temp = temp->next;
        temp->next = newnode;
        rear = newnode;
    }
}

void display(){
    if(front == NULL) cout<<"Queue is Empty"<<endl;
    else{
        Node *temp = front;
        while(temp != NULL)
        {
            cout<<temp->data<<" ";
            temp = temp->next;
        }
    }cout<<endl;
}
void reverse(){
    Node *curr{front}, *prev{NULL}, *next{NULL};
    while(curr!= NULL){
        next = curr->next;
        curr->next = prev;
        prev = curr;
        curr = next;
    }
    front = prev;
}
int main(){
    int value, check=1;
    while(check){
        cin>>value;
        if(value>=0){
            enqueue(value);
        }
        else check=0;
    }
  	if(front==NULL){
    	cout<<"Queue is empty"<<endl;     
    }
  	else{
      cout<<"Before reversing:"<<endl;
      display();
      reverse();
      cout<<"After reversing:"<<endl;
      display();
    }
    return 0;
}