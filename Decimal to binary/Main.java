#include<stdio.h>
int main()
{
  //Type your code here
  int num,n,rem,bin=0,place=1;
  scanf("%d",&num);
  n=num;
  while(n>0)
  {
    rem=n%2;
    bin+=rem*place;
    place*=10;
    n/=2;
  }
  printf("%d",bin);
  return 0;
}