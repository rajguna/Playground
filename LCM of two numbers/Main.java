#include<stdio.h>
int main()
{
   int n,n1,s,lcm,i;
  scanf("%d %d",&n,&n1);
   for(i=1;i<=n+n1;i++)
  {
    if(n%i==0 && n1%i==0)
    {
      s=i;
    }
  }
  lcm=(n*n1)/s;
  printf("%d",lcm);
  return 0;
}