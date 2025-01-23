#include <bits/stdc++.h>
using namespace std;typedef long long ll;
int main(){
    int t;cin>>t;
    while(t--){
        string s;cin>>s;
        ll som=0,nb2=0,nb3=0;
        for(int i=0;i<s.size();i++){
            som=som+s[i]-'0';
            if(s[i]=='2') nb2++;
            else if (s[i]=='3') nb3++;
        }
        if(som%9==0) {cout<<"YES"<<endl;}
        else{int test=0;som=som%9;
            ll vrt2=nb2,vrt3=nb3,nbre=som;
            for(int i=0;i<=vrt3;i++){
                som=som%9;
                if(som%2==1){int x=(9-som)/2;if(x<=nb2) {test=1;break;}}
                else if (som%2==0){int x=som/2;if(x+nb2>=9) {test=1;break;}}
                som=nbre+6*(i+1);
                if(som%9==0 && i!=vrt3) {test=1;break;}
            }
            
            cout<<(test?"YES":"NO")<<endl;
        }
        
    }
}