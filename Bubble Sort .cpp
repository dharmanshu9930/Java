#include <bits/stdc++.h>
using namespace std;

int main() {
	// your code goes here

    int n ;
    cin >> n ;

    vector<int> vec ( n ) ;

    for ( int i=0 ; i < n ; i++ )
    {
        cin >> vec[i] ;
    }

	for ( int i=0 ; i < n ; i++ )
	{
	    for ( int j=1 ; j < n-i ; j++ )
	    {
	        if ( vec[j] < vec[j-1]  )
	        {
	            vec[j] = vec[j] + vec[j-1] ;
	            vec[j-1] = vec[j] - vec[j-1] ;
	            vec[j] = vec[j] - vec[j-1] ;
	        }
	    }
	}

	for ( int i=0 ; i < n ; i++ )
	{
	    cout << vec[i] << " " ;
	}

	return 0;
}
