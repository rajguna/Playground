#include<stdio.h>
int main()
{
  //Type your code here
  int n=365,x,y;
   
  scanf("%d",n);
  x=n%4;
  y=n/4;
  printf("Quotient: %d\n",y);
  printf("Remainder: %d\n",x);
  
  return 0;
}