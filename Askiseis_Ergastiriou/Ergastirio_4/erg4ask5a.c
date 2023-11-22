#include <stdio.h>

/*

Laboratory 4, Exercise 5a.

What will the following program display?

Result :

a: 4, b: 5
a: 3, b: 3

*/

int main(void) {

    int a = 5, b;

    b = a--;

    printf("a: %d, b: %d\n", a, b);

    b = --a;

    printf("a: %d, b: %d\n", a, b);
    
}