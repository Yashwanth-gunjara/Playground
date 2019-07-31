#include<stdio.h>
#include<math.h>
int main()
{
  float pi,area;
  int r;
  scanf("%d",&r);
  pi=3.14;
  area=(float)pi*r*r/4;
  printf("%.2f",area);
  return 0;
}