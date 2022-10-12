#include<iostream>
using namespace std;
#include<string>
struct CricketInfo
{
	char playerName[100];
	char country[100];
	int age;
	int nomp; 
};
class Search
{
	private:
		struct CricketInfo c[10];
	public:
		void inputInfo(int n)
		{
			for(int i=0;i<n;i++)
			{
				cout<<"Enetr the playerName : ";
				cin>>c[i].playerName;
				cout<<"Enter the country : ";
				cin>>c[i].country;
				cout<<"Enter the age : ";
				cin>>c[i].age;
				cout<<"Enter the number of matches played : ";
				cin>>c[i].nomp;
			}
		}
		/*void searchCountry(string pCountry,string playername[],int n,int &nop)
		{
			int looker = 0;
			nop = 0;
			while(looker<n)
			{
				if(pCountry == c[looker].country)
				{
					playername[nop] = c[looker].playerName;
					nop++;
				}
				looker++;
			}
			
		}*/
		bool searchCountry(string pCountry,string playername[],int n,int &nop,int looker)
		{
			if(looker>n)
			{
				looker = -1;
				return false;
			}
			if(pCountry == c[looker].country)
			{
				playername[nop] = c[looker].playerName;
				nop++;
			}
			return searchCountry(pCountry,playername,n,nop,(looker+1));
			return true;
		}
};
int main()
{
	Search s;
	int n,nop=0,looker=0;
	string pCountry,playername[10];
	cout<<"Enter number of players :";
	cin>>n;
	s.inputInfo(n);
	cout<<"Enter the country to be searched : ";
	cin>>pCountry;
	s.searchCountry(pCountry,playername,n,nop,looker);
	//s.searchCountry(pCountry,playername,n,nop);
	for(int i=0;i<nop;i++)
	{
		cout<<playername[i];
		cout<<endl;
	}
	return 0;
}
