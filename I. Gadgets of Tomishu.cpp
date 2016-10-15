#include <iostream>
using namespace std;



unsigned long long countStrings(unsigned long long n)
{
    unsigned long long a[n], b[n];
    a[0] = b[0] = 1;
    for (unsigned long long i = 1; i < n; i++)
    {
        a[i] = a[i-1] + b[i-1];
        b[i] = a[i-1];
    }

    return a[n-1] + b[n-1];
   /* unsigned long long a[n+1];
    a[1] = 2;
    a[2] = 3;
    for (unsigned long long i = 3; i < n+1; i++)
    {
        a[i] = a[i-1] + a[i-2];
    }

    return a[n];*/
}


unsigned long long modulo(unsigned long long b,unsigned long long pow,unsigned long long m){
    unsigned long long x,i,p;
    x = 1;
    p = b%m;
    while(pow){
        if( (pow & 1) == 1){
            x=(x*p)% m;
        }
        p = (p*p)%m;
        pow = pow>>1;
    }
    return x;
}


int main()
{

    int t;
    cin>>t;
    int test=1;

    while(t--){
        unsigned long long n,k,M;
        cin>>n>>k>>M;
        unsigned long long num=countStrings(n);
        cout<<"Case "<< test++ <<": " << modulo(k,num,M);
    }

    return 0;
}
