#include <stdio.h>

/*

Laboratory 3, Exercise 2.

What is the output of the following program?

Result :

R1: 12
R2: 12

*/

int main(void) {

    float i = 2.3, j = 10.5;

    int x = (int)i + j;

    printf("R1: %d\nR2: %d\n", x, (int)(i + (int)j));
    
}