#include<stdio.h>
int main()
{
  char c;
  scanf("%s",&c);
  if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='u')
    printf("Vowel");
  else
    printf("Consonant");      
  return 0;
}