#include<iostream>
using namespace std;

void find(int arr[],int target)
{
    int s=0;
    int e=7;

    int mid=(s+e)/2;

    while(s<=e)
    {
        mid=(s+e)/2;

        if(arr[mid]<arr[mid-1])
        {
            break;
        }
        else if(arr[mid]>=arr[s] and arr[mid]>arr[e])
        {
            s=mid+1;
        }
        else
        {
            e=mid-1;
        }

    }

    cout<<mid;
}

int main()
{
    int arr[8]={6,7,0,1,2,3,4,5};
    int target=6;

    find(arr,target);

    return 0;
}