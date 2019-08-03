#include<stdio.h>
int main()
{
  //Type your code here
  int n,m,d,a;
  scanf("%d",&n);
  m=n/100;
  d=n%10;
  a=m+d;
  printf("%d",a);
  return 0;
}