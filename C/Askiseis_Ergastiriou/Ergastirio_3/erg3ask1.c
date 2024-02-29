#include <stdio.h>

/*

Laboratory 3, Exercise 1.

What is the output of the following program?

Result :

R1: 40
R2: 20

*/


int main(void) {

    int x = 10;

    x = x + x;

    printf("R1: %d\nR2: %d\n", x + x, x);
    
}