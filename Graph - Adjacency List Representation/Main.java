#include<iostream>
#include<vector>
using namespace std;

int main(){
    int v, e, x, y, w;
    cout<<"Enter the number of vertices:"<<endl;
    cin>>v;
    cout<<"Enter the number of edges:"<<endl;
    cin>>e;
    vector<int> AdjList[v];
    for(int i=0;i < e;i++){  
        cout<<"Enter the Start node and End node of edge "<<i+1<<endl;
        cin>>x>>y;
        AdjList[x].push_back(y);
        AdjList[y].push_back(x);
    }
    cout<<"Adjacency List:"<<endl;
    for(int i=0;i < v;i++){
        cout<<i<<"--->";
        for(int j : AdjList[i]){
            cout<<j<<" ";
        }
        cout<<endl;
    }
    return 0;
}