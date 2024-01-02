#include<iostream>
using namespace std;
int main(){
	cout << "Total no of soldiers :";
	int N;
	cin >> N;
	cout << "Enter the weapons of each soldier \n";
	int arr[N];
	for(int i=0; i<N; i++){
		cin >> arr[i];
	}
	int even=0;
	int odd=0;
	for(int i=0; i<N; i++){
		if(arr[i]%2==0){
			even++;
		}else{
			odd++;
		}
	}
	if(even>odd){
		cout << "ready for battle";
	}else{
		cout << "Not ready";
	}

}