#include <stdio.h>
int main() {
	//Type your code
  int n,d,m,a,b,i,r,sum,j,e;
  scanf("%d",&n);
  d=n/100;
  m=n%100;
  a=d/10;
  j=a/10;
  e=a%10;
  b=d%10;
  i=m/10;
  r=m%10;
  sum =j+e+b+i+r;
  printf("%d",sum);
  
	return 0;
}