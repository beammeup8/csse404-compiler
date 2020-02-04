#include <stdio.h>
#include <stdlib.h>
void nothing()
{
  int *i = malloc(20);
  *i = 20;
  int k = *i + 70;
  free(i);
}