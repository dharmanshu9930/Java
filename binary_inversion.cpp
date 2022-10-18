#include<bits/stdc++.h>
using namespace std;
#define int             long long int
#define endl            "\n"
#define pb              push_back
#define ppb             pop_back
#define pf              push_front
#define ppf             pop_front
#define pii             pair<int,int>
#define all(v)          v.begin(),v.end()
#define umap            unordered_map<int,int>
#define omap            map<int,int>


string to_upper(string &a) { for (int i=0;i<(int)a.size();++i) if (a[i]>='a' && a[i]<='z') a[i]-='a'-'A'; return a; }
string to_lower(string &a) { for (int i=0;i<(int)a.size();++i) if (a[i]>='A' && a[i]<='Z') a[i]+='a'-'A'; return a; }
int gcd(int a,int b){if(b==0)return a;return gcd(b,a%b);}
int lcm(int a,int b){return (a/gcd(a,b))*b;}
void printarr(int arr[],int n){for(int i=0;i<n;i++)cout<<arr[i]<<" ";}

bool cmp(pair<int,int> p1,pair<int,int> p2)
{
    return p1.second<p2.second;
}


void dsc()
{
    int n,m;
    cin>>n>>m;
    string arr[n];
    vector<pair<int,int>> v;
    int count=0;
    for(int i=0;i<n;i++)
    {
        cin>>arr[i];
        count=0;
        for(int j=0;j<m;j++)
        {
            if(arr[i][j]=='1')
            count++;
        }
        pair<int,int> p;
        p.first=i;
        p.second=count;
        v.push_back(p);
    }
    sort(v.begin(),v.end(),cmp);
    string ans;
    for(int i=0;i<n;i++)
    {
        ans+=arr[v[i].first];
    }
    int ones=0,x=0;
    for(int i=0;i<n*m;i++)
    {
        if(ans[i]=='1')
        ones++;
        else
        {
            x+=ones;
        }
    }
    cout<<x<<endl;
}
signed main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);cout.tie(NULL);
    //freopen("input.txt", "r", stdin);
	//freopen("output.txt", "w", stdout);
    int t;
    cin>>t;
    while(t--)
    dsc();
}