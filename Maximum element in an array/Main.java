#include<stdio.h>
int main()
{
  int a[50],size,i,l;
  scanf("%d",&size);
  for(i=0;i<size;i++)
  {
    scanf("%d",&a[i]);
  }
  l=a[0];
  for(i=1;i<size;i++)
  {
    if (l<a[i])
      l=a[i];
  }
  printf("%d",l);
}