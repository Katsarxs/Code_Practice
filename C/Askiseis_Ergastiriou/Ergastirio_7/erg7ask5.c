#include <stdio.h>

/*

Laboratory 7, Exercise 5.

What will the following program segment display?

Result :

100

*/

int main(void) {

    int a = 5, k;

    k = (a > 0) ? 100 : -1;

    printf("%d", k);

}