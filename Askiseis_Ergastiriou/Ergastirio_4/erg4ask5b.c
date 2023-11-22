#include <stdio.h>

/*

Laboratory 4, Exercise 5b.

What will the following program display?

Result :

6

*/

int main(void) {

    int a = 5, b = 6, c = 7;

    printf("%d\n", (++a) - (b--) + (--c));
    
}