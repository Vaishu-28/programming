#include<iostream>
using namespace std;
int size=100;
int stack[100];
int top=-1;
void push(int value)
{
    // []
    // Insert 4 into stack 
    // [4]
    // insert 8 inot stack
    // [4,5] -> as per your code [5]
    // [] -> [1,2,3,4,5,6,7,8,9,10]
    if(top>size){
        // When top excedes size
        cout<<"Top exceeded the size ;-> Stack Overflow";
    }
    else{
        // When top is with in size
        top ++; // Where there are no elements, top is -1. When inserting 1st elemnt top should be at 0. Increment first then insert.
        stack[top]=value;
    }
}

 void peek()
 {
     if(top>=0)
     {
     cout<<"The entered stack value is:";
     cout<<stack[top];
     }
     else
     {
         cout<<"Stack is empty";
     }
 }
 
 void pop()
 {
     if(top>=0)
     {
         cout<<stack[top];
         top--;
     }
     else
     {
         cout<<"Stack is empty";
     }
 }

int main()
{
    peek();
    push(5);
    push(6);
    push(9);
    push(3);
    pop();
    peek();
    push(4);
    peek();
    pop();
    return 0;
}
