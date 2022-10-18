#include<iostream>
using namespace std;
class stack{
  private:
  char s[20];
  int top;
  char t;
  char post[20];
  char b[20];
  public:
  stack(){
   top=-1;
   //n=20;
  }
  void inTopost(char b[20],int n){
    for(int i=0;i<n;i++){
     if(b[i]=='('){
       top++;
       s[top]=b[i];
     }
     else if(b[i]==')'){
       t=s[top];
       top--;
       while(t!='('){
         post[i]=t;
         t=s[top];
         top--;
       }
     }
     else if(b[i]=='+'||b[i]=='-'||b[i]=='*'||b[i]=='/'||b[i]=='^'){
        char token;
        token=s[top];
        while(top!=-1 && priority(b[i])<priority(token)){
            char tokenOut;
            tokenOut=s[top];
            top--;
            post[i]=tokenOut;
        }
        top++;
        s[top]=token;
        }
        else{
            top++;
            post[i]=b[i];
        }
        while(top!=-1){
            char character;
            character=s[top];
            post[i]=character;
        }
     }
  }

 int priority(char x){
    int y;
    if(x=='+'){
     y= 1;
    }
    if(x=='-'){
     y= 1;
    }
    if(x=='*'){
     y= 2;
    }
    if(x=='/'){
     y= 2;
    }
    if(x=='^'){
     y=3;
    }
    return y;
  }
int empty(){
    if(top==-1){
     return 1;
    }
    else{
     return 0;
    }
  }
};
  
  int main(){
      stack s;
      char x[20];
      int n;
      cout<<"Enter the length of expression"<<endl;
      cin>>n;
      cout<<"Enter the expression"<<endl;
      for(int i=0;i<n;i++){
          cin>>x[i];
      }
      s.inTopost(&x[20],n);
      return 0;
  }
