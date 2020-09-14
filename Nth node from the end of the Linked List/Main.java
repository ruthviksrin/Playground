#include<iostream>
using namespace std;
typedef struct Node{
    int data;
    Node* next;
}Node;
void append(Node **head, int x){
    Node *newnode = new Node;
    Node *last = *head;
    newnode->data = x;
    newnode->next = NULL;
    if(*head == NULL){
        *head = newnode;
    }
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
        cout<< temp->data;
        if(temp->next != NULL)
            cout<<"->";
        temp = temp->next;
    }
}

int NnodeFromEnd(Node** head, int size, int pos){
    Node *temp = *head;
    if(size - pos < 0){
        return -1;
    }
    else{
        int itr = size-pos;
        for(int i=0;i < itr;i++){
            temp =temp->next;
        }
        return temp->data;
    }
}
int main(){
    int size{0};
    Node *head = NULL;
    int x;
    bool check{true};
    while(check){
        cin >> x;
        if(x>=0){
            append(&head, x);
            size++;
        }
        else{
            check =false;
        }
    }
    int n;
  	cout<<"Enter the nth node:"<<endl;
    cin >> n;
    int ans = NnodeFromEnd(&head, size, n);
    if(ans == -1)
        cout <<"There is no nth node in the list"<<endl;
    else
        cout <<ans<<" is the nth node element in the list"<<endl;
    return 0;    
}