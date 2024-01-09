#include<iostream>
#include <climits>
using namespace std;
int main(){
	int t;
	cin >> t;
	while(t--){
		int N, M;
		cin >> N >> M;
		int basket[N];
		int Price[N];
		int Min[M+1] = {0};
		cout << "Enter all the basket" <<endl;
		for(int i=0; i<N; i++){
			cin >> basket[N];
		}
		for(int i=0; i<N; i++){
			cin >> Price[N];
		}
		for(int i=0; i<N; i++){
			int basket_number = basket[i];
			int pp = Price[i];
			Min[basket_number] += pp;
		}
		int min_amount = INT_MAX;
		for(int i=1; i<=M; i++){
			if(min_amount > Min[i]){
				min_amount = Min[i];
			}
		}
		cout << min_amount;
	}
}