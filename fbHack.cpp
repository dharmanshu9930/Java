#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    int b=1;
    while(t--)
    {   
        int n,m;
        cin>>n>>m;
        int a[n];
        for(int i=0;i<n;i++)
        {
            cin>>a[i];
        }
        map<int ,int>mp;
        for(int i=0;i<n;i++)
        {
            mp[a[i]]++;
        }
        int mx=INT_MIN;
        for(auto x:mp)
        {
           if(x.second>mx)
           mx=x.second;
        }
        if(mx>2 || mp.size()>(2*m))
        cout<<"Case #"<<b<<": NO"<<endl;
        else
        cout<<"Case #"<<b<<": YES"<<endl;
        b++;
    }
    return 0;
}