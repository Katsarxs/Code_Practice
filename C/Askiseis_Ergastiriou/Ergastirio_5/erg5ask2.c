#include <stdio.h>

/*

Laboratory 5, Exercise 2.

What will the following program display?

Result :

0
8 2 1

*/

int main(void) {

    int i = 5, j = 10, k = 15;

    printf("%d\n", (i <= j) == !(j <= k));

    i += 2;

    j -= ++i;

    k %= j;

    printf("%d %d %d\n", i, j, k);
    
}