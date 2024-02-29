#include <stdio.h>

/*

Laboratory 5, Exercise 3a.

What will the following program display?

Result :

8, 8
7, 8

*/

int main(void) {

    int i = 7;

    printf("%d, ", ++i);

    printf("%d\n", i);

    i = 7;

    printf("%d, ", i++);

    printf("%d\n", i);

}