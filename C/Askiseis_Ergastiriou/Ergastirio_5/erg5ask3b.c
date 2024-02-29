#include <stdio.h>

/*

Laboratory 5, Exercise 3b.

What will the following program display?

Result :

0
1
1
1

*/

int main(void) {

    int a = 4, b = 5, c = 3;

    printf("%d\n", a && a / b);

    printf("%d\n", ++a == b++);

    printf("%d\n", a || 0);

    printf("%d\n", a < b < c);

}