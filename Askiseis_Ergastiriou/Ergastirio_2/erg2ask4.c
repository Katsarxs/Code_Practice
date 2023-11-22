#include <stdio.h>

/*

Laboratory 2, Exercise 4.

The errors in the following program and the correction so that the program finally displays the values ​​of the variables a, b, and c.

False Program :

$include <studio.h>
INT main(void)
[
    int b = a/2; a = 10
    float c = 4,5 + a;
    printf("%d %d\n", a, c, b);
    retern 0;
]

*/

int main(void) {

    int a, b;

    float c;

    a = 10;

    b = a / 2;

    c = 4.5 + a;

    printf("%d %d %f\n", a, b, c);

    return 0;

}