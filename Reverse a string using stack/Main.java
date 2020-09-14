#include<iostream>
#include<cstring>
using namespace std;
typedef struct Node Node;
struct Node{
    char data;
    Node *next;
}*head{NULL};
void push(char value){
    Node *newnode = new Node;
    Node *temp = head;
    newnode->data = value;
    newnode->next = NULL;
    if(head==NULL)
        head = newnode;
    else{
        head = newnode;
        newnode->next = temp;
    }
}
void pop(){
    if(head == NULL) cout<<"Stack is Empty"<<endl;
    else{
        Node* temp = head;
        cout<<"Poped : "<<temp->data<<endl;
        head = temp->next;
        delete(temp);
    }
}
void display(){
    if(head == NULL) cout<<"Stack is Empty"<<endl;
    else{
        Node *temp =head;
        while(temp!= NULL){
            cout<<temp->data;
            temp= temp->next;
        }
    }
}
void peek(){
    if(head==NULL) cout<<"Stack is Empty"<<endl;
    else cout<<"The top : "<<head->data<<endl;
}
int main() {
    char str[30];
    cin>>str;
    for(int i=0;i < strlen(str);i++){
        push(str[i]);
    }
    display();
    return 0;
}