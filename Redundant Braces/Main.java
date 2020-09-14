#include<iostream>
#include<cstring>
using namespace std;

struct Node{
    char data;
    Node *next;
}*head = NULL;

void push(char s){
    Node *newnode = new Node;
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
        head = temp->next;
        temp->next = NULL;
        delete(temp);
    }
}
char top(){ return head->data; }
int checkRedundency(char *str){
    for(int i=0;i< strlen(str);i++){
        if(str[i]==')'){
            char t = top();
            pop();
            int flag = 1;
            while(t!='('){
                if(t=='+' || t=='-'|| t=='*' || t=='/')
                    flag = 0;    
                t = top();
                pop();
            }
            if(flag==1)
                return 1;
        }
        else{
            push(str[i]);
        }
    }
    return 0;
}
int main(){
    char str[40];
    cin>>str;
    if(checkRedundency(str)==1)
        cout<<"Yes"<<endl;
    else
        cout<<"No"<<endl;
    return 0;
}