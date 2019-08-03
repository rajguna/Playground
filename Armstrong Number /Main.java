#include <stdio.h>
int main() {
	//Type your code
  int n,temp,rem,digit=0,sum=0;
  scanf("%d",&n);
  temp=n;
  while(temp!=0)
  {
    digit++;
    temp=temp/10;
  }
  temp=n;
  while(temp!=0)
  {
    rem=temp%10;
    sum=sum + pow(rem,digit);
    temp=temp/10;
  }
  if(sum==n)
  {
    printf("Armstrong Number");
  }
  else
  {
    printf("Not an Armstrong Number");
  }
  
	return 0;
}