#include<stdio.h>
int main()
{
   int n,a,d,odd,even,ans1,ans2;
   scanf("%d",&n);
  if(n%2==1)
  {
    a=0,d=2;
    odd=(n+1)/2;
    ans1=a+(odd-1)*d;
    printf("%d",ans1);
  }
  else
  {
    a=0,d=1;
    even=n/2;
    ans2=a+(even-1)*d;
    printf("%d",ans2);
  }
   
return 0;	
}