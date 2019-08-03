#include<stdio.h>
int main()
{
  int num,bin,dec=0,base=1,rem;
  scanf("%d",&num);
  bin=num;
  while(num>0)
  {
    rem=num%10;
    dec+=rem*base;
    num/=10;
    base*=2;
  }
  printf("%d",dec);
  return 0;
}