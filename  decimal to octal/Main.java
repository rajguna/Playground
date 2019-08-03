#include<stdio.h>
int main()
{
  //type your code here
  int n,i,j,oc=0,dn;
  scanf("%d",&n);
  dn=n;
  i=1;
  for(j=n;j>0;j=j/8)
  {
    oc=oc+(j%8)*i;
    i*=10;
    n/=8;
  }
  printf("%d",oc);
  
  return 0;
}