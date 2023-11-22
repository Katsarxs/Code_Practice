#include <stdio.h>

/*

Laboratory 4, Exercise 5c.

What will the following program display?

Result :

1 1 0

*/

int main(void) {

    int i = 5, j = 10, k;

    i = (i > 5) + (j <= 10);

    j = (i == 5) + ((j + 2) >= 10);

    k = (i != 1);

    printf("%d %d %d\n", i, j, k);
    
}