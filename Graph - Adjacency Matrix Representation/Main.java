#include<iostream>
using namespace std;

int main(){
    int n, e, a, b, w;
    string s;
    cout<<"Please enter the number of nodes in the graph"<<endl;
    cin>>n;
    cout<<"Please enter the number of edges in the graph"<<endl;
    cin>>e;
    cout<<"Is the graph directed"<<endl;
    cin>>s;
    int adjmat[n][n];
    for(int i=0;i < n;i++){
        for(int j=0;j < n;j++){
            adjmat[i][j] =0;
        }
    }
    cout<<"Adjacency Matrix Representation:"<<endl;
    for(int i=0;i < n;i++){
        for(int j=0;j < n;j++){
            cout<<adjmat[i][j]<<" ";
        }
        cout<<endl;
    }
    if(s =="yes"){
        for(int i=0;i < e;i++){
            cout<<"Enter the start node, end node and weight of edge no "<<i+1<<endl;
            cin>>a>>b>>w;
            adjmat[a-1][b-1] = w;
        }
    }
    else{
        for(int i=0;i < e;i++){
            cout<<"Enter the start node, end node and weight of edge no "<<i+1<<endl;
            cin>>a>>b>>w;
            adjmat[a-1][b-1] = adjmat[b-1][a-1] = w;
        }
    }
    cout<<"Adjacency Matrix Representation:"<<endl;
    for(int i=0;i < n;i++){
        for(int j=0;j < n;j++){
            cout<<adjmat[i][j]<<" ";
        }
        cout<<endl;
    }
    return 0;
}