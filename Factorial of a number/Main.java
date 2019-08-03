#include <stdio.h>
int main() {
	//Type your code
  int n,i;
  scanf("%d",&n);
  int fact=1;
  for(i=1;i<=n;i++)
  {
     fact=fact*i;
  }
  printf("%d",fact);
	return 0;
}