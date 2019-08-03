#include <stdio.h>
int main() {
	//Type your code 
  int n,a,b,r,i;
  scanf("%d",&n);
  if(n>=100)
  { 
    a=n/100;
     b=a/10;
     i=b%10;
  printf("%d",i);
  }
  else
  {
    r=n%10;
    printf("%d", r);
  }
  
	return 0;
}