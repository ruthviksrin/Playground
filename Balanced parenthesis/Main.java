#include<iostream>
#include<cstring>
using namespace std;

struct Node{
    char data;
    Node *next;
}*head = NULL;

void push(char s){
    Node *newnode = new Node();
    Node *temp = head;
    newnode->data = s;
    newnode->next = NULL;
    if(head == NULL)
        head = newnode;
    else{
        newnode->next = temp;
        head = newnode;
    }
}
void pop(){
    if(head == NULL)
        cout<<"Stack is empty"<<endl;
    else{
        Node *temp = head;
      	Node *temp1 = head->next;
        head = temp1;
        temp->next = NULL;
        free(temp);
    }
}
char top(){ return head->data; }
int BalanceCheck(char *str){
    char t;
    for(int i=0;i < strlen(str);i++){
        if(str[i]=='(' || str[i]=='{' || str[i]=='['){
            push(str[i]);
            continue;
        }
      	if(head == NULL)
          	return 0;
        switch(str[i]){
            case ')':
                t = top();
                pop();
                if(t=='{' || t=='[')
                    return 0;
                break;
            case '}':
                t = top();
                pop();
                if(t=='(' || t=='[')
                    return 0;
                break;
            case ']':
                t = top();
                pop();
                if(t=='{' || t=='(')
                    return 0;
                break;
        }
    }
    return 1;
}
int main(){
    char str[40];
    cin>>str;
    if(BalanceCheck(str)==1)
        cout<<"Balanced"<<endl;
    else
        cout<<"Not Balanced"<<endl;
    return 0;
}