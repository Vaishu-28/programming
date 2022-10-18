#include<iostream>
using namespace std;
#include<string>

struct CricketInfo{
    char name[20];
    char country[20];
    int age;
    int nomp;
};

class input{
    private:
    struct CricketInfo c[10];
    public:
    void get(int n){
        for(int i=0;i<n;i++){
            cout<<"Enter the Name of player"<<endl;
            cin>>c[i].name;
            cout<<"Enter the country of player"<<endl;
            cin>>c[i].country;
            cout<<"Enter the age of player"<<endl;
            cin>>c[i].age;
            cout<<"Enter the no of matches played"<<endl;
            cin>>c[i].nomp;
        }
    }
    bool search(string country,string name[],int n,int &count,int looker){
        if(looker>n){
            looker = -1;
            return false;
        }
        if(country==c[looker].country){
            name[nop]=c[looker].name;
            nop++;
        }
        return(country,name,n,count,looker+1);
        return true;
    }
};

int main(){
    search s;
    int n,nop=0,looker=0;
    cout<<"Enter number of players"<<endl;
    cin>>n
    s.get(n);
    search(country,name,n,nop,looker);
    for(int i=0;i<nop;i++){
        cout<<name[i]<<endl;
    }
  return 0;
}
