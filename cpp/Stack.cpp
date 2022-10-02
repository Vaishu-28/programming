
#include<iostream>
using namespace std;
class stack{
private:
 int top;
 int n=10;
 int t;
 int s[10];
public:
 stack(){
  top=-1;
 }
 void push(int v){
  if(top>=n-1){ 
    cout<<"Stack is full";
  }
  else{
       top++;
       s[top]=v;
  }
  cout<<"Value is pushed"<<endl;
 }
 void pop(){
  if(top==-1){
   cout<<"Stack is empty"<<endl;
  }
  else{
   s[top]=t;
   top--;
  }
  cout<<"Element is removed"<<endl;
 }
 void peek(){
  if(top==-1){
   cout<<"Stack is empty";
  }
  else{
   cout<<"Stack contains elements and value of top is:"<<s[top]<<endl;
  }
 }
 void empty(){
  if(top==-1){
   cout<<"The stack is empty"<<endl;
  }
  else{
   cout<<"stack has elements"<<endl;
  }
 }
 void full(){
  if(top==n-1){
   cout<<"The stack is full"<<endl;
  }
  else{
   cout<<"The stack is not full"<<endl;
  }
 }
 void peep(){
  int index=top;
  int value;
  cout<<"Enter searching value";
  cin>>value;
  while(index>=0){
      if(s[index]==value){
     cout<<"The value is found at:"<<index<<endl;
   }
   else{
    index--;
   }
 }
}
void traverse(){
 if(top==-1){
  cout<<"Stack is empty";
 }
 else{
  for(int i=top;i>=0;i--){
   cout<<s[i]<<" "<<endl;
  }
 }
}
};

int main(){
 stack s;
 int x,value;
 cout<<"1.push 2.pop 3.peek 4.empty 5.full 6.peep 7.traverse"<<endl;
 do{
    cout<<"Enter the digit according to operation to be performed"<<endl;
     cin>>x;
 switch(x){
  case 1:
    cout<<"enter value to be pushed"<<endl;
    cin>>value;
    s.push(value);
    break;
  case 2:
    s.pop();
    break;
  case 3:
    s.peek();
    break;
  case 4:
    s.empty();
    break;
  case 5:
    s.full();
    break;
  case 6:
    s.peep();
    break;
  case 7:
    s.traverse();
    break;
  default:
    cout<<"Enter the correct digit";
  }
 }while(x<8);
 return 0;
}
