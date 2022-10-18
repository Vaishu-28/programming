//
//  Patient1.cpp
//  Patient.cpp
//
//  Created by Vaishnavi Vangireddy on 12/10/22.
//
#include<iostream>
using namespace std;
#include<string>

struct PatientInfo{
    char PatientName[100];
    char gender;
    int age;
    char bloodgroup;
};
class patient{
    private:
    struct PatientInfo p[10];
    public:
    void get(int n){
    cout<<"Enter the patient details with age in ascending order"<<endl;
        for(int i=0;i<n;i++){
            cout<<"Enter the name of patient"<<endl;
            cin>>p[i].PatientName;
            cout<<"Enter the gender of patient"<<endl;
            cin>>p[i].gender;
            cout<<"Enter age of patient"<<endl;
            cin>>p[i].age;
            cout<<"Enter blood group of patient"<<endl;
            cin>>p[i].bloodgroup;
        }
    }
    bool binary(int pAge,char pName[],int start,int end,int locn){
        int mid = 0;
        bool found;
        while(start<=end){
        mid=start+end/2;
        if(pAge>p[mid].age){
            start=mid+1;
        }
        else{
            if(pAge<p[mid].age){
            end=mid-1;
            }
            else{
                start=end+1;
            }
        }
        }
       locn=mid;
        if(pAge==p[mid].age&&p[mid].gender=='m'){
            found=true;
            pName=p[mid].PatientName;
            //cout<<"The patient name is "<<p[mid].PatientName<<endl;
        }
        else{
            found=false;
            //cout<<"Not found"<<endl;
        }
        return found;
    }
};
int main(){
    patient pa;
    int pAge,locn=0;
    char pName[10];
    int n;
    bool x;
    cout<<"Enter the size of array"<<endl;
    cin>>n;
    pa.get(n);
    cout<<"Enter the age to be searched"<<endl;
    cin>>pAge;
    x=pa.binary(pAge,pName,0,n,locn);
    //pa.binary(pAge,pName,0,n,locn);
    if(x==true){
        cout<<"The patient name is"<<pName<<endl;
    }
    else{
        cout<<"There is no patient who is a male with given age";
    }
    return 0;
}
