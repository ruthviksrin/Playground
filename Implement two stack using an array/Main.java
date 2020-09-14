#include<iostream>
using namespace std;
#define SIZE 1000
int stack[SIZE], top1 = -1, top2 = (SIZE/2)-1;

void push1(int x){
    if(top1 >=SIZE/2){
        cout<<"Stack is full can't insert!!"<<endl;
    }
    else{
        top1++;
        stack[top1] = x;
    }
}
void push2(int x){
    if(top2 >=SIZE){
        cout<<"Stack is full can't insert!!"<<endl;
    }
    else{
        top2++;
        stack[top2] = x;
    }
}
void pop1(){
    if(top1== -1){
        cout<<"Stack underflow. pop from stack 1 failed"<<endl;
    }
    else
    {
        top1--;
    }
}
void pop2(){
    if(top1== (SIZE/2)-1){
        cout<<"Stack underflow. pop from stack 2 failed"<<endl;
    }
    else
    {
        top2--;
    }
}
void display1(){
    if(top1== -1){
		return;
    }
    else
    {
        for(int i = top1;i >=0;i--)
            cout<<stack[i]<<" ";
    }
}
void display2(){
    if(top2== (SIZE/2)-1){
        return;
    }
    else
    {
        for(int i = top2;i >=SIZE/2;i--)
            cout<<stack[i]<<" ";
    }
}
int main(){
    int size1, size2, i, j, x;
    cin>>size1;
    for(i = 0;i < size1;i++){
        cin>>x;
        push1(x);
    }
    cin>>size2;
    for(j = i;j < size2+size1;j++){
        cin>>x;
        push2(x);
    }
    cout<<"Stack 1 Elements:"<<endl;
    display1();
    cout<<endl;
  	cout<<"Stack 2 Elements:"<<endl;
    display2();
  	cout<<endl;
    int  pops1, pops2;
    cin>>pops1>>pops2;
    while(pops1 > 0){
        pop1();
        pops1--;
    }
    while(pops2 > 0){
        pop2();
        pops2--;
    }
    cout<<"Stack 1 Elements:"<<endl;
    display1();
    cout<<endl;
  	cout<<"Stack 2 Elements:"<<endl;
    display2();
    cout<<endl;
  	return 0;
}